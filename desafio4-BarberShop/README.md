# 💈 Barber Shop

Este repositório corresponde ao Desafio #04 da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025) para fornecer instruções sobre como criar um aplicativo Full-Stack para agendamentos em barbearias, utilizando Java no backend e Angular no frontend. O sistema permitirá o cadastro de clientes, agendamento de horários e gerenciamento de serviços.

> ⚠️ **Nota:** projetos originais da DIO - [Backend](https://github.com/digitalinnovationone/barber-shop-api) e [Frontend](https://github.com/digitalinnovationone/barber-shop-ui).

### Índice
- [Desafio de Projeto]()
- [Tecnologias Utilizadas]()
- [Objetivos]()
- [Imagens do Projeto]()
- [Instruções de Uso]()

### 🎯 Desafio de Projeto
O desafio deste projeto é desenvolver um aplicativo Full-Stack para agendamentos em barbearias, utilizando Java no backend e Angular no frontend. O sistema permitirá o cadastro de clientes, agendamento de horários e gerenciamento de serviços.

### 🛠️ Tecnologias Utilizadas
|  |
|-------------|
| <a href="https://developer.mozilla.org/pt-BR/docs/Web/HTML"><img src="https://skillicons.dev/icons?i=html" alt="html"/></a> <a href="https://developer.mozilla.org/pt-BR/docs/Web/CSS"><img src="https://skillicons.dev/icons?i=css" alt="css"/></a> <a href="https://angular.dev/"><img src="https://skillicons.dev/icons?i=angular" alt="angular"/></a> <a href="https://www.typescriptlang.org/"><img src="https://skillicons.dev/icons?i=typescript" alt="typescript"/></a> <a href="https://www.java.com/"><img src="https://skillicons.dev/icons?i=java" alt="Java"/></a> <a href="https://spring.io/"><img src="https://skillicons.dev/icons?i=spring" alt="Spring"/></a> <a href="https://www.postgresql.org/"><img src="https://skillicons.dev/icons?i=mysql" alt="MySQL"/></a> 

### 📋 Objetivos
O objetivo é criar um sistema Java com Spring de agendamento de antedimento em uma barbearia, com funcionalidades tanto no backend quanto no frontend. Vamos usar JPA com Hibernate para salvar os dados no MySQL, gerenciar migrations do banco de Dados com Flyway e utilizar a lib do Material e assim explorar alguns conceitos do framework Angular.

**1. Funcionalidades Principais:**  
- [x] **CRUD**: Permitir cadastrar, listar, editar e excluir clientes.
- [x] **Agendamento de Horários:** Permitir que os clientes agendem horários para serviços.
- [x] **Responsividade:** Garantir que o frontend seja responsivo e funcione bem em diferentes dispositivos.
- [x] **Integração com APIs:** Integrar o frontend com o backend para operações de CRUD.


**2. Requisitos:**
- [x] **Java 21:** Utilizar a versão 21 do Java para o desenvolvimento do backend.
- [x] **Spring Boot:** Utilizar o Spring Boot para criar a API RESTful.
- [x] **Gradle:** Utilizar o Gradle como ferramenta de automação de build.
- [x] **Angular 19:** Utilizar a versão 19 do Angular para o desenvolvimento do frontend.
- [x] **MySQL:** Utilizar o MySQL como banco de dados.
- [x] **Docker:** Utilizar Docker para containerização das aplicações.
- [x] **Bootstrap:** Utilizar o Bootstrap para estilização e design responsivo.
- [x] **JavaScript:** Utilizar JavaScript para funcionalidades dinâmicas no frontend.
- [x] **TypeScript:** Utilizar TypeScript para desenvolvimento tipado no frontend.
- [x] **HTML:** Utilizar HTML para a estruturação das páginas web.
- [x] **CSS:** Utilizar CSS para a estilização das páginas web.


Este projeto é uma excelente oportunidade para praticar e aprimorar habilidades em Angular, desenvolvimento de front-end, testes unitários e deploy de aplicações web.

### 🖨️ Imagens do Projeto
<img width="350" src="">
<img width="350" src="">
<img width="350" src="">
<img width="350" src="">

### ▶️ Intruções de Uso
**1. Pré-requisitos:**  
Certifique-se de ter o [Node.js 20.18.3](https://nodejs.org/pt/blog/release/v20.18.3), o [Java 21.0.6](https://www.oracle.com/br/java/technologies/downloads/#jdk21-windows), o Angular CLI 19.1.5 e o [Docker](https://www.docker.com/) instalados em sua máquina. 

Você pode verificar se o Java, Node.js, Angular CLI e Docker estão instalados na máquina executando:

```
node -v
ng version
java -version 
docker -v
```

**2. Instalação:**
Clone os repositórios para a sua máquina local:
```
git clone https://github.com/ItaloRochaj/barber-shop-ui.git
git clone https://github.com/ItaloRochaj/barber-shop-api.git
```

**3. Configuração do Backend:**
Navegue até o diretório do backend:
```
cd barber-shop-api
```

Construa e inicie os containers Docker:
```
docker-compose up --build
```

**4. Configuração do Frontend:**
Navegue até o diretório do frontend:
```
cd barber-shop-ui
```

Para instalar o [Node.js 20.18.3](https://nodejs.org/pt/blog/release/v20.18.3), deve-se baixar e instalar na máquina pelo arquivo `.exe`. Já o angular pode ser instalado através do terminal:
```
npm install @angular/cli@19.1.5

//global
npm install -g @angular/cli@19.1.5
```

Instale as dependências do projeto:
```
npm install
```

**3. Executando o Servidor de Desenvolvimento:**
Para iniciar o servidor de desenvolvimento, execute `Run`do projeto Java e execute:
```
ng serve
```

Navegue até http://localhost:4200/. A aplicação será recarregada automaticamente se você alterar qualquer um dos arquivos de origem.

**4. Build:**
Para construir o projeto, execute:
```
ng build
```

Os artefatos de construção serão armazenados no diretório dist/.


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
