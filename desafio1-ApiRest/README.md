## ☕ Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Render

Este repositório corresponde ao Desafio #01 da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025) para fornecer instruções sobre como construir uma API REST do zero utilizando o Java 17 com Spring Boot 3, com o auxílio do Spring Data JPA, OpenAPI, Docker, Swagger e Render. 

> ⚠️ **Nota:** no [projeto original da DIO](https://github.com/falvojr/santander-dev-week-2023), foi utilizado o Railway, porém por problema técnico da plataforma, substitui pela plataforma Render.

### Índice
- [Desafio de Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio1-ApiRest#-desafio-de-projeto)
- [Tecnologias Utilizadas](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio1-ApiRest#%EF%B8%8F-tecnologias-utilizadas)
- [Objetivos](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio1-ApiRest#-objetivos)
- [Imagens do Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio1-ApiRest#%EF%B8%8F-imagens-do-projeto)
- [Instruções de Uso](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio1-ApiRest#%EF%B8%8F-intru%C3%A7%C3%B5es-de-uso)

### 🎯 Desafio de Projeto
O desafio do projeto consiste em construir uma API RESTful do zero utilizando Java 17 com Spring Boot 3. O objetivo é criar uma solução eficiente e escalável, incorporando tecnologias como Spring Data JPA para manipulação de dados, OpenAPI para documentação automática, Swagger para visualização interativa da API, Docker para containerização e Render para deploy. Durante o desenvolvimento, o foco será em boas práticas de construção de APIs, integração de ferramentas e automação, proporcionando uma experiência completa de desenvolvimento e deploy de uma API moderna e funcional.

### 🛠️ Tecnologias Utilizadas
|  |
|-------------|
| <a href="https://www.java.com/"><img src="https://skillicons.dev/icons?i=java" alt="Java"/></a> <a href="https://spring.io/"><img src="https://skillicons.dev/icons?i=spring" alt="Spring"/></a> <a href="https://www.postgresql.org/"><img src="https://skillicons.dev/icons?i=postgresql" alt="PostgreSQL"/></a> <a href="https://www.docker.com/"><img src="https://skillicons.dev/icons?i=docker" alt="Docker" /></a> <a href="https://www.postman.com/"><img src="https://skillicons.dev/icons?i=postman" alt="Postman"/></a> <a href="https://swagger.io/"><img width="47" src="https://github.com/rhayssakramer/rhayssakramer/blob/main/img/swagger.svg"></a>|

### 📋 Objetivos
Este projeto tem como objetivo desenvolver uma aplicação CRUD (Create, Read, Update, Delete) usando Java com Spring Boot para gerenciar usuários, contas bancárias, cartões de crédito, funcionalidades e notícias. Abaixo estão os principais componentes e funcionalidades implementadas no projeto.

**1. Estrutura do Projeto:**
- [x] Backend: Spring Boot e Java
- [x] Model: Define as entidades do banco de dados, incluindo User, Account, Card, Feature e News.
- [x] DTO (Data Transfer Object): Encapsula e estrutura as informações que serão enviadas ou recebidas, garantindo uma melhor organização e separação de preocupações.
- [x] Repository: Interface JPA que fornece métodos para interagir com o banco de dados.
- [x] Service: Contém a lógica de negócios e métodos CRUD.
- [x] Controller: Controladores REST que mapeiam os endpoints para as operações CRUD e manipulam as requisições HTTP.

**2. Entidades do Banco de Dados:**
- [x] User: Representa um usuário no sistema e está associado a uma Account (conta bancária), um Card (cartão de crédito), uma lista de Feature (funcionalidades) e uma lista de News (notícias).
- [x] Account: Contém informações sobre a conta bancária do usuário, como número da conta, agência, saldo e limite.
- [x] Card: Contém informações sobre o cartão de crédito do usuário, como número e limite disponível.
- [x] Feature: Representa funcionalidades disponíveis para o usuário.
- [x] News: Representa notícias associadas ao usuário.

**3. Operações CRUD:**
- [x] Create (Criar): Permite criar novos usuários no sistema com suas respectivas contas, cartões, funcionalidades e notícias.
- [x] Read (Ler): Permite buscar usuários por ID e listar todos os usuários cadastrados.
- [x] Update (Atualizar): Permite atualizar as informações de um usuário existente.
- [x] Delete (Deletar): Permite deletar um usuário do sistema.

**4. Tratamento de Exceções:**
- [x] Implementação de um manipulador global de exceções (GlobalExceptionHandler) para lidar com exceções comuns, como NoSuchElementException e IllegalArgumentException, e retornar mensagens apropriadas ao cliente.

**5. Log de Operações:**
- [x] Adição de mensagens de log para informar sobre o status das operações CRUD, exibindo mensagens no console, como "Usuário criado com sucesso", "Usuários listados", "Usuário atualizado com sucesso" e "Usuário deletado com sucesso".

**6. Docker e Render**
- [x] Docker: Criação de um Dockerfile para definir a imagem do Docker, incluindo a configuração do ambiente, instalação de dependências e execução da aplicação.
- [x] Render: Deployment da aplicação no Render, um serviço de hospedagem na nuvem. Isso facilita o processo de deploy e gerenciamento da aplicação, permitindo que ela seja acessada de qualquer lugar.

Com essas implementações, o projeto oferece uma aplicação robusta para gerenciamento de usuários e suas respectivas informações bancárias e de cartão de crédito, seguindo as melhores práticas de desenvolvimento com Spring Boot e Java.

### 🖨️ Imagens do Projeto
<img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio1-ApiRest/assets/print1.png"><img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio1-ApiRest/assets/print2.png"><img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio1-ApiRest/assets/print3.png"><img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio1-ApiRest/assets/print4.png"><img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio1-ApiRest/assets/print5.png"><img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio1-ApiRest/assets/print6.png">

### ▶️ Intruções de Uso
Antes de começar, certifique-se de ter os seguintes requisitos instalados no seu sistema:
- [Java 17](https://www.oracle.com/br/java/technologies/downloads/)
- Gradle
- [Docker](https://www.docker.com/products/docker-desktop/)
- [Postman](https://www.postman.com/downloads/)
- [PostgreSQL](https://www.postgresql.org/download/)

#### Configuração do Ambiente
1. Clone o Repositório:
```
git clone <URL-DO-REPOSITORIO>
cd <NOME-DO-REPOSITORIO>
```

2. Configuração do Banco de Dados: O projeto usa um banco de dados PostgreSQL. Certifique-se de configurar as credenciais do banco de dados no arquivo `application.properties`.

#### Executando a Aplicação com Docker
1. Crie o arquivo Dockerfile:
```
# Use uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Adicione um volume apontando para /tmp
VOLUME /tmp

# Defina o diretório de trabalho no container
WORKDIR /app

# Copie o arquivo JAR da aplicação para o container
COPY build/libs/api-decola-tech-0.0.1-SNAPSHOT.jar /app/app.jar

# Exponha a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
```

2. Crie o arquivo docker-compose.yml:
```
version: '3.8'

services:
  postgres:
    image: postgres:13
    environment:
      POSTGRES_DB: db_decola
      POSTGRES_USER: user
      POSTGRES_PASSWORD: password
    ports:
      - "5432:5432"
    volumes:
      - db_data:/var/lib/postgresql/data

  app:
    build: .
    ports:
      - "8080:8080"
    depends_on:
      - postgres

volumes:
  db_data:
```
3. Construa e Inicie os Contêineres:
```
docker-compose up --build
```

#### Executando a Aplicação Localmente
1. Construa o Projeto:
```
gradle clean build
```

2. Execute a Aplicação:
```
gradle bootRun
```

#### Testando a API com Postman
1. GET - Listar Todos os Usuários
    - URL: http://localhost:8080/users
    - Method: GET
2. GET - Buscar Usuário por ID
    - URL: http://localhost:8080/users/{id}
    - Method: GET
3. POST - Criar Novo Usuário
    - URL: http://localhost:8080/users
    - Method: POST
    - Body (JSON):
```
json
{
    "name": "Italo",
    "account": {
        "number": "654321",
        "agency": "002",
        "balance": 1500.75,
        "limit": 3000.00
    },
    "card": {
        "number": "123456789",
        "limit": 1500.00
    },
    "features": [
        {
            "icon": "icon2",
            "description": "Feature 2"
        }
    ],
    "news": [
        {
            "icon": "icon-news2",
            "description": "News 2"
        }
    ]
}
```
4. PUT - Atualizar Usuário Existente
    - URL: http://localhost:8080/users/{id}
    - Method: PUT
    - Body (JSON):
```
json
{
    "name": "João Atualizado",
    "account": {
        "number": "654321",
        "agency": "002",
        "balance": 2000.00,
        "limit": 3500.00
    },
    "card": {
        "number": "123456789",
        "limit": 1800.00
    },
    "features": [
        {
            "icon": "icon2",
            "description": "Feature 2"
        }
    ],
    "news": [
        {
            "icon": "icon-news2",
            "description": "News 2"
        }
    ]
}
```
5. DELETE - Deletar Usuário
    - URL: http://localhost:8080/users/{id}
    - Method: DELETE

#### Documentação da API com Swagger
1. Acesse a Documentação:
    - URL: https://decola-tech.onrender.com/swagger-ui/index.html  

A documentação da API gerada pelo Swagger estará disponível para explorar e testar os endpoints.

#### Deploy na Nuvem com Render
1. Crie uma Conta no Render: Acesse [render.com](https://render.com) e crie uma conta.
2. Conecte o Repositório: Conecte o seu repositório do GitHub/GitLab ao Render.
3. Configure o Serviço: Crie um novo serviço web no Render e configure para usar o Dockerfile existente no projeto.
4. Deploy Contínuo: Configure o deploy contínuo para que o Render automaticamente crie uma nova versão da aplicação sempre que houver mudanças no repositório.

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
