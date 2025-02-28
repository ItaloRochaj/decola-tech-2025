## ☕ Criando seu Board de Tarefas com Java

Este repositório corresponde ao Desafio #02 da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025) para fornecer instruções sobre como construir um board de tarefas utilizando Java 17, Spring 3 e MySQL, incluindo como melhoria, funcionalidade de saída para exportação dos dados em arquivo PDF. 

> ⚠️ **Nota:** [projeto original da DIO](https://github.com/digitalinnovationone/board.git).

### Índice
- [Desafio de Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio2-BoardTasks#-desafio-de-projeto)
- [Tecnologias Utilizadas](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio2-BoardTasks#%EF%B8%8F-tecnologias-utilizadas)
- [Objetivos](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio2-BoardTasks#-objetivos)
- [Imagens do Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio2-BoardTasks#%EF%B8%8F-imagens-do-projeto)
- [Instruções de Uso](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio2-BoardTasks#%EF%B8%8F-intru%C3%A7%C3%B5es-de-uso)

### 🎯 Desafio de Projeto
O desafio do projeto consiste em construir um board de tarefas em Java. O objetivo foi passar por todas as etapas do desenvolvimento, desde o planejamento e estruturação até a implementação de funcionalidades como gerenciamento de dados e integração entre camadas, seguindo boas práticas de programação.

### 🛠️ Tecnologias Utilizadas
|  |
|-------------|
| <a href="https://www.java.com/"><img src="https://skillicons.dev/icons?i=java" alt="Java"/></a> <a href="https://spring.io/"><img src="https://skillicons.dev/icons?i=spring" alt="Spring"/></a> <a href="https://www.postgresql.org/"><img src="https://skillicons.dev/icons?i=mysql" alt="MySQL"/></a> 

### 📋 Objetivos
Este projeto tem como objetivo criar um board de tarefas em Java, desenvolvendo uma aplicação CRUD (Create, Read, Update, Delete) para gerenciar tarefas, através de um menu no terminal, incluindo a funcionalidade de exportação de dados em PDF.

**1. Estrutura do Projeto:**
- [x] CRUD (Create, Read, Update, Delete)
- [x] DTO (Data Transfer Object): Encapsula e estrutura as informações que serão enviadas ou recebidas, garantindo uma melhor organização e separação de preocupações.
- [x] Service: Contém a lógica de negócios e métodos CRUD.

**2. Requisitos do Projeto**
- [x] O código deve iniciar disponibilizando um menu com as seguintes opções: Criar novo board, Selecionar board, Excluir boards, Sair;
- [x] O código deve salvar o board com suas informações no banco de dados MySQL;

**3. Regras do Board**
- [x] Um board deve ter um nome e ser composto por pelo menos 3 colunas ( coluna onde o card é colocado inicialmente, coluna para cards com tarefas concluídas e coluna para cards cancelados, a nomenclatura das colunas é de escolha livre);
- [x] As colunas tem seu respectivo nome, ordem que aparece no board e seu tipo (Inicial, cancelamento, final e pendente);
- [x] Cada board só pode ter 1 coluna do tipo inicial, cancelamento e final, colunas do tipo pendente podem ter quantas forem necessárias, obrigatoriamente a coluna inicial deve ser a primeira coluna do board, a final deve ser a penúltima e a de cancelamento deve ser a última
- [x] As colunas podem ter 0 ou N cards, cada card tem o seu título, descrição, data de criação e se está bloqueado;
- [x] Um card deve navegar nas colunas seguindo a ordem delas no board, sem pular nenhuma etapa, exceto pela coluna de cards cancelados que pode receber cards diretamente de qualquer coluna que não for a coluna final;
- [x] Se um card estiver marcado como bloqueado ele não pode ser movido até ser desbloqueado
- [x] Para bloquear um card deve-se informar o motivo de seu bloqueio e para desbloquea-lo deve-se também informar o motivo

**4. Menu de manipulação de board selecionado**
- [x] O menu deve permitir mover o card para próxima coluna, cancelar um card, criar um card, bloquea-lo, desbloquea-lo e fechar board;

**5. Requisitos opcionais**
- [x] Um card deve armazenar a data e hora em que foi colocado em uma coluna e a data e hora que foi movido pra a próxima coluna;
- [x] O código deve gerar um relatório do board selecionado com o tempo que cada tarefa demorou para ser concluída com informações do tempo que levou em cada coluna
- [x] O código dever gerar um relatório do board selecionado com o os bloqueios dos cards, com o tempo que ficaram bloqueados e com a justificativa dos bloqueios e desbloqueios.

**6. Melhorias**  
Este projeto inclui uma funcionalidade para exportar relatórios de um board de tarefas para um arquivo PDF. A implementação foi feita utilizando a biblioteca iText para geração de PDFs e JDBC para conexão e extração de dados de um banco de dados MySQL.
- [x] iText: Biblioteca para criação e manipulação de documentos PDF.
- [x] JDBC (Java Database Connectivity): API para conexão e execução de consultas no banco de dados MySQL.
- [x] MySQL: Sistema de gerenciamento de banco de dados relacional usado para armazenar os dados dos boards e cartões.
- [x] O objetivo da funcionalidade é permitir que os usuários exportem relatórios dos boards em formato PDF, contendo informações detalhadas sobre os cartões associados a cada board.

Com essas implementações, o projeto oferece uma aplicação robusta para gerenciamento de board de tarefas e suas respectivas informações, seguindo as melhores práticas de desenvolvimento com Spring Boot e Java.

### 🖨️ Imagens do Projeto
<img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio2-BoardTasks/assets/img1.png"><img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio2-BoardTasks/assets/img2.png"><img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio2-BoardTasks/assets/img3.png">

### ▶️ Intruções de Uso
Antes de começar, certifique-se de ter os seguintes requisitos instalados no seu sistema:
- [Java 17](https://www.oracle.com/br/java/technologies/downloads/)
- [Gradle](https://gradle.org/)
- [MySQL](https://www.mysql.com/)

#### Configuração do Ambiente
1. Clone o Repositório:
```
git clone <URL-DO-REPOSITORIO>
cd <NOME-DO-REPOSITORIO>
```
2. Configure o banco de dados MySQL:
    - Crie um banco de dados chamado `board_tasks`.
    - Atualize o arquivo `application.properties` com as credenciais do seu banco de dados.

3. Compile e execute o projeto:
    ```sh
    ./gradlew bootRun
    ```

4. Acesse a aplicação:
    - A aplicação estará disponível em `http://localhost:8080`.

#### Utilização da Aplicação
1. **Criar novo board**:
    - Selecione a opção "Criar novo board" no menu principal.
    - Insira o nome do board e as colunas necessárias.

2. **Selecionar board**:
    - Selecione a opção "Selecionar board" no menu principal.
    - Escolha o board que deseja manipular.

3. **Manipulação de cards**:
    - No menu de manipulação do board, você pode:
        - Mover um card para a próxima coluna.
        - Cancelar um card.
        - Criar um novo card.
        - Bloquear ou desbloquear um card (informando o motivo).

4. **Relatórios**:
    - Gere relatórios do board selecionado com informações sobre o tempo de conclusão das tarefas e os bloqueios dos cards.

### ✅ Conclusão
Este guia serve como repositório de estudos, desafios e projetos da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025). Explore os recursos compartilhados necessários para atender às suas necessidades da bootcamp.

## 🖋️ Créditos
Este repositório foi desenvolvido como guia de estudos da Bootcamp Decola Tech 2025, para avaliar o ensinado na bootcamp.

*Nota: Este projeto é apenas para fins educacionais e não possui nenhuma afiliação oficial com a Avanade ou franquia DIO, ou suas empresas associadas.*

### 👨🏻‍💻 Autor:
<table style="border=0">
  <tr>
    <td align="left">
      <a href="https://github.com/ItaloRochaj">
        <span><b>Italo Rocha</b></span>
      </a>
      <br>
      <span>Full-Stack Development</span>
    </td>
  </tr>
</table>
