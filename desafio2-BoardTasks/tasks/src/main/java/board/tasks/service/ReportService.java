package board.tasks.service;

import org.apache.commons.csv.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;

public class ReportService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board";
    private static final String DB_USER = "italo";
    private static final String DB_PASSWORD = "japa@20";

    public void exportToCSV(String boardName) {
        String filePath = boardName + "_report.csv"; // Caminho relativo

        // Imprime o caminho completo onde o arquivo será salvo
        System.out.println("Arquivo CSV será salvo em: " + new File(filePath).getAbsolutePath());

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             FileWriter writer = new FileWriter(filePath);
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                     .withHeader("Card ID", "Título", "Descrição", "Data Criação", "Tempo Total", "Bloqueios"))) {

            String query = "SELECT c.id, c.title, c.description, c.created_at, " +
                    "(TIMESTAMPDIFF(SECOND, c.created_at, c.finished_at)) AS tempo_total, " +
                    "(SELECT COUNT(*) FROM bloqueios WHERE card_id = c.id) AS total_bloqueios " +
                    "FROM cards c WHERE c.board_id = (SELECT id FROM boards WHERE name = ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, boardName);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    csvPrinter.printRecord(
                            rs.getInt("id"),
                            rs.getString("title"),
                            rs.getString("description"),
                            rs.getTimestamp("created_at"),
                            rs.getInt("tempo_total") + " segundos",
                            rs.getInt("total_bloqueios")
                    );
                }
            }

            csvPrinter.flush();
            System.out.println("Relatório CSV gerado com sucesso: " + filePath);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }


    // Método para exportar relatório PDF
    public void exportToPDF(String boardName) {
        String filePath = boardName + "_report.pdf";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PdfWriter writer = new PdfWriter(new File(filePath));
             PdfDocument pdfDoc = new PdfDocument(writer);
             Document document = new Document(pdfDoc)) {

            // Adiciona o título do relatório
            document.add(new Paragraph("Relatório do Board: " + boardName).setBold().setFontSize(16));

            // Cria a tabela com 5 colunas
            Table table = new Table(5);
            table.addHeaderCell("Card ID");
            table.addHeaderCell("Título");
            table.addHeaderCell("Descrição");
            table.addHeaderCell("Tempo Total");
            table.addHeaderCell("Bloqueios");

            // Consulta para obter os dados do board
            String query = "SELECT c.id, c.title, c.description, c.created_at, " +
                    "(TIMESTAMPDIFF(SECOND, c.created_at, c.finished_at)) AS tempo_total, " +
                    "(SELECT COUNT(*) FROM bloqueios WHERE card_id = c.id) AS total_bloqueios " +
                    "FROM cards c WHERE c.board_id = (SELECT id FROM boards WHERE name = ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, boardName);
                ResultSet rs = pstmt.executeQuery();

                // Verifica se a consulta retornou algum dado
                if (!rs.isBeforeFirst()) {
                    document.add(new Paragraph("Nenhum dado encontrado para o board: " + boardName));
                    System.out.println("Nenhum dado encontrado para o board: " + boardName);
                } else {
                    // Preenche a tabela com os dados dos cards
                    while (rs.next()) {
                        table.addCell(String.valueOf(rs.getInt("id")));
                        table.addCell(rs.getString("title"));
                        table.addCell(rs.getString("description"));
                        table.addCell(rs.getInt("tempo_total") + " segundos");
                        table.addCell(String.valueOf(rs.getInt("total_bloqueios")));
                    }
                    document.add(table);
                }
            }

            document.close();
            System.out.println("Relatório PDF gerado com sucesso: " + filePath);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}

