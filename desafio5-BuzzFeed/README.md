# 👾 BuzzFeed Quizz

Este repositório corresponde ao Desafio #05 da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025) para fornecer instruções sobre como construir um clone do BuzzFeed Quizz com Angular 14, incluindo como melhorias testes unitários e deploy no [Vercel](https://vercel.com/).

> ⚠️ **Nota:** [projeto original da DIO](https://github.com/felipeAguiarCode/angular-buzzfeed-quizz-clone).

### Índice
- [Desafio de Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio5-BuzzFeed#-desafio-de-projeto)
- [Tecnologias Utilizadas](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio5-BuzzFeed#%EF%B8%8F-tecnologias-utilizadas)
- [Objetivos](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio5-BuzzFeed#-objetivos)
- [Imagens do Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio5-BuzzFeed#%EF%B8%8F-imagens-do-projeto)
- [Instruções de Uso](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio5-BuzzFeed#%EF%B8%8F-intru%C3%A7%C3%B5es-de-uso)

### 🎯 Desafio de Projeto
O desafio deste projeto é construir um clone do BuzzFeed Quizz utilizando Angular 14, tendo como objetivo replicar a funcionalidade de quizzes interativos, permitindo que os usuários respondam a perguntas e obtenham resultados baseados em suas respostas.

### 🛠️ Tecnologias Utilizadas
|  |
|-------------|
| <a href="https://developer.mozilla.org/pt-BR/docs/Web/HTML"><img src="https://skillicons.dev/icons?i=html" alt="html"/></a> <a href="https://developer.mozilla.org/pt-BR/docs/Web/CSS"><img src="https://skillicons.dev/icons?i=css" alt="css"/></a> <a href="https://angular.dev/"><img src="https://skillicons.dev/icons?i=angular" alt="angular"/></a> <a href="https://www.typescriptlang.org/"><img src="https://skillicons.dev/icons?i=typescript" alt="typescript"/></a> 

### 📋 Objetivos
O principal objetivo deste projeto é construir um clone do BuzzFeed Quizz utilizando Angular 14. A aplicação deve permitir que os usuários participem de quizzes interativos, com resultados baseados nas respostas fornecidas. Além disso, o projeto visa:
- [x] **Melhorar habilidades em Angular:** Praticar o desenvolvimento de aplicações web utilizando Angular 14.
- [x] **Componentização:** Aprender a dividir a aplicação em componentes reutilizáveis e bem estruturados.

**1. Funcionalidades Principais:**
- [x] **Utilização de Quizzes:** Permitir a utilização de quizzes com perguntas e respostas personalizadas.
- [x] **Interatividade:** Implementar lógica para calcular e exibir resultados baseados nas respostas dos usuários.
- [x] **Responsividade:** Garantir que a aplicação seja responsiva e funcione bem em diferentes dispositivos e tamanhos de tela.
- [x] **Testes Unitários:** Escrever testes unitários para garantir a qualidade e a funcionalidade do código.
- [x] **Deploy:** Realizar o deploy da aplicação utilizando o [Vercel](https://vercel.com/).

**2. Requisitos:**
- [x] **Angular 14:** Utilizar a versão 14 do Angular para o desenvolvimento da aplicação.
- [x] **Componentização:** Dividir a aplicação em componentes reutilizáveis e bem estruturados.
- [x] **Serviços:** Implementar serviços para gerenciar a lógica de negócios e a comunicação com APIs, se necessário.
- [x] **Testes:** Escrever testes unitários utilizando frameworks como Jasmine e Karma.
- [x] **Deploy:** Configurar e realizar o deploy da aplicação no Vercel.

**3. Testes Existentes:**
`AppComponent Testes:`
- [x] Verifica a criação do componente.
- [x] Verifica o título do aplicativo.
- [x] Testa a navegação para a rota "quizz".
- [x] Verifica a renderização do título do QuizzComponent.
- [x] Testa o clique de botão e a chamada de métodos.

`QuizzComponent Testes:`
- [x] Verifica a criação do componente.
- [x] Verifica a renderização do título.
- [x] Verifica se uma variável específica está definida.
- [x] Testa a chamada de um método específico (someMethod).

`HomeComponent Testes:`
- [x] Verifica a criação do componente.
- [x] Verifica a renderização do título no QuizzComponent.

Este projeto é uma excelente oportunidade para praticar e aprimorar habilidades em Angular, desenvolvimento de front-end, testes unitários e deploy de aplicações web.

### 🖨️ Imagens do Projeto
<img width="350" src="">
<img width="350" src="">
<img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio5-BuzzFeed/assets/testes.jpeg">
<img width="350" src="https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio5-BuzzFeed/assets/coverage.png">

### ▶️ Intruções de Uso
**1. Pré-requisitos:**
Certifique-se de ter o [Node.js 16.16.0](https://nodejs.org/pt/blog/release/v16.16.0) e o Angular CLI 14.2.13 instalados em sua máquina. 

Você pode verificar se o Node.js e o Angular CLI estão instalados na máquina executando:

```
node -v
ng version
```

**2. Instalação:**
Para instalar o  [Node.js 16.16.0](https://nodejs.org/pt/blog/release/v16.16.0), deve-se baixar e instalar na máquina pelo arquivo `.exe`. Já o angular pode ser instalado através do terminal:
```
npm install @angular/cli@14.2.13

//global
npm install -g @angular/cli@14.2.13
```

Clone o repositório para a sua máquina local:
```
git clone https://github.com/ItaloRochaj/buzz-feed.git
```

Navegue até o diretório do projeto:
```
cd buzz-feed
```

Instale as dependências do projeto:
```
npm install
```

**3. Executando o Servidor de Desenvolvimento:**
Para iniciar o servidor de desenvolvimento, execute:
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

**5. Executando Testes Unitários:**
Para executar os testes unitários via Karma, execute:
```
ng test --code-coverage
```

**6. Deploy:**
Para realizar o deploy da aplicação no Vercel, siga os passos abaixo:

Instale o Vercel CLI globalmente:
```
npm install -g vercel
```

Faça login no Vercel:
```
vercel login
```

Execute o comando de deploy no diretório do projeto:
```
 vercel
```

Siga as instruções fornecidas pelo Vercel CLI para completar o processo de deploy.

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
