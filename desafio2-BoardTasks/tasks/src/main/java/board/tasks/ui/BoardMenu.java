package board.tasks.ui;

import board.tasks.dto.BoardColumnInfoDTO;
import board.tasks.persistence.entity.BoardColumnEntity;
import board.tasks.persistence.entity.BoardEntity;
import board.tasks.persistence.entity.CardEntity;
import board.tasks.service.*;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.Scanner;

import static board.tasks.persistence.config.ConnectionConfig.getConnection;

@AllArgsConstructor
public class BoardMenu {
    private final ReportService reportService = new ReportService();
    private final BoardEntity entity;

    public void execute() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Bem-vindo ao board %s, selecione a operação desejada:\n", entity.getId());
            int option;
            do {
                System.out.println("1 - Criar um card");
                System.out.println("2 - Mover um card");
                System.out.println("3 - Bloquear um card");
                System.out.println("4 - Desbloquear um card");
                System.out.println("5 - Cancelar um card");
                System.out.println("6 - Ver board");
                System.out.println("7 - Ver coluna com cards");
                System.out.println("8 - Ver card");
                System.out.println("9 - Voltar para o menu anterior");
                System.out.println("10 - Exportar relatório (CSV)");
                System.out.println("11 - Exportar relatório (PDF)");
                System.out.println("12 - Sair");

                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, insira um número válido.");
                    scanner.next();
                }
                option = scanner.nextInt();
                scanner.nextLine(); // Limpa a linha após nextInt()

                switch (option) {
                    case 1 -> createCard(scanner);
                    case 2 -> moveCardToNextColumn(scanner);
                    case 3 -> blockCard(scanner);
                    case 4 -> unblockCard(scanner);
                    case 5 -> cancelCard(scanner);
                    case 6 -> showBoard();
                    case 7 -> showColumn(scanner);
                    case 8 -> showCard(scanner);
                    case 9 -> System.out.println("Voltando para o menu anterior");
                    case 10 -> reportService.exportToCSV(entity.getName()); // Exportar CSV
                    case 11 -> reportService.exportToPDF(entity.getName()); // Exportar PDF
                    case 12 -> {
                        System.out.println("Saindo...");
                        return;
                    }
                    default -> System.out.println("Opção inválida, informe uma opção do menu");
                }
            } while (option != 9);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão com o banco de dados: " + ex.getMessage());
        }
    }

    private void showColumn(Scanner scanner) {
    }

    private void createCard(Scanner scanner) throws SQLException {
        var card = new CardEntity();
        System.out.println("Informe o título do card:");
        card.setTitle(scanner.nextLine());
        System.out.println("Informe a descrição do card:");
        card.setDescription(scanner.nextLine());
        card.setBoardColumn(entity.getInitialColumn());
        try (var connection = getConnection()) {
            new CardService(connection).create(card);
        }
    }

    private void moveCardToNextColumn(Scanner scanner) throws SQLException {
        System.out.println("Informe o id do card que deseja mover para a próxima coluna:");
        long cardId = readLong(scanner);
        var boardColumnsInfo = entity.getBoardColumns().stream()
                .map(bc -> new BoardColumnInfoDTO(bc.getId(), bc.getOrder(), bc.getKind()))
                .toList();
        try (var connection = getConnection()) {
            new CardService(connection).moveToNextColumn(cardId, boardColumnsInfo);
        } catch (RuntimeException ex) {
            System.out.println("Erro ao mover o card: " + ex.getMessage());
        }
    }

    private void blockCard(Scanner scanner) throws SQLException {
        System.out.println("Informe o id do card que será bloqueado:");
        long cardId = readLong(scanner);
        System.out.println("Informe o motivo do bloqueio do card:");
        String reason = scanner.nextLine();
        var boardColumnsInfo = entity.getBoardColumns().stream()
                .map(bc -> new BoardColumnInfoDTO(bc.getId(), bc.getOrder(), bc.getKind()))
                .toList();
        try (var connection = getConnection()) {
            new CardService(connection).block(cardId, reason, boardColumnsInfo);
        } catch (RuntimeException ex) {
            System.out.println("Erro ao bloquear o card: " + ex.getMessage());
        }
    }

    private void unblockCard(Scanner scanner) throws SQLException {
        System.out.println("Informe o id do card que será desbloqueado:");
        long cardId = readLong(scanner);
        System.out.println("Informe o motivo do desbloqueio do card:");
        String reason = scanner.nextLine();
        try (var connection = getConnection()) {
            new CardService(connection).unblock(cardId, reason);
        } catch (RuntimeException ex) {
            System.out.println("Erro ao desbloquear o card: " + ex.getMessage());
        }
    }

    private void cancelCard(Scanner scanner) throws SQLException {
        System.out.println("Informe o id do card que deseja mover para a coluna de cancelamento:");
        long cardId = readLong(scanner);
        var cancelColumn = entity.getCancelColumn();
        var boardColumnsInfo = entity.getBoardColumns().stream()
                .map(bc -> new BoardColumnInfoDTO(bc.getId(), bc.getOrder(), bc.getKind()))
                .toList();
        try (var connection = getConnection()) {
            new CardService(connection).cancel(cardId, cancelColumn.getId(), boardColumnsInfo);
        } catch (RuntimeException ex) {
            System.out.println("Erro ao cancelar o card: " + ex.getMessage());
        }
    }

    private void showBoard() throws SQLException {
        try (var connection = getConnection()) {
            new BoardQueryService(connection).showBoardDetails(entity.getId())
                    .ifPresent(b -> {
                        System.out.printf("Board [%s, %s]\n", b.id(), b.name());
                        b.columns().forEach(c ->
                                System.out.printf("Coluna [%s] tipo: [%s] tem %s cards\n", c.name(), c.kind(), c.cardsAmount())
                        );
                    });
        }
    }

    private void showCard(Scanner scanner) throws SQLException {
        System.out.println("Informe o id do card que deseja visualizar:");
        long selectedCardId = readLong(scanner);
        try (var connection = getConnection()) {
            new CardQueryService(connection).findById(selectedCardId).ifPresentOrElse(
                    c -> {
                        System.out.printf("Card %s - %s.\n", c.id(), c.title());
                        System.out.printf("Descrição: %s\n", c.description());
                    },
                    () -> System.out.printf("Não existe um card com o id %s\n", selectedCardId)
            );
        }
    }

    private long readLong(Scanner scanner) {
        while (!scanner.hasNextLong()) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next();
        }
        long value = scanner.nextLong();
        scanner.nextLine();
        return value;
    }
}
