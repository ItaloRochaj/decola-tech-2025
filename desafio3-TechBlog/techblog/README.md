# 📘 Tech Blog

Este repositório corresponde ao Desafio #03 da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025) para fornecer instruções sobre como criar uma aplicação de blog funcional, construindo componentes inteligentes e aprendendo como organizar seu projeto Angular utilizando as ferramentas que o próprio framework oferece, incluindo como melhoria mias seções e e funcionalidades e o deploy no [Vercel](https://vercel.com/).

> ⚠️ **Nota:** [projeto original da DIO](https://github.com/felipeAguiarCode/angular-blog).

### Índice
- [Desafio de Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio3-TechBlog#-desafio-de-projeto)
- [Tecnologias Utilizadas](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio3-TechBlog#%EF%B8%8F-tecnologias-utilizadas)
- [Objetivos](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio3-TechBlog#-objetivos)
- [Imagens do Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio3-TechBlog#%EF%B8%8F-imagens-do-projeto)
- [Instruções de Uso](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio3-TechBlog#%EF%B8%8F-intru%C3%A7%C3%B5es-de-uso)

### 🎯 Desafio de Projeto
O desafio deste projeto é desenvolver uma aplicação de blog funcional com Angular, construindo componentes inteligentes e organizando o projeto de forma eficiente utilizando as ferramentas nativas do framework.

### 🛠️ Tecnologias Utilizadas
|  |
|-------------|
| <a href="https://developer.mozilla.org/pt-BR/docs/Web/HTML"><img src="https://skillicons.dev/icons?i=html" alt="html"/></a> <a href="https://developer.mozilla.org/pt-BR/docs/Web/CSS"><img src="https://skillicons.dev/icons?i=css" alt="css"/></a> <a href="https://angular.dev/"><img src="https://skillicons.dev/icons?i=angular" alt="angular"/></a> <a href="https://www.typescriptlang.org/"><img src="https://skillicons.dev/icons?i=typescript" alt="typescript"/></a> 

### 📋 Objetivos
O objetivo é criar um Tech Blog dinâmico e escalável, permitindo a publicação de artigos, categorização de conteúdos e interação com os usuários. Como melhorias, o desafio inclui a implementação de novas seções e funcionalidades para aprimorar a experiência do usuário. Por fim, será realizado o deploy da aplicação na Vercel, garantindo acessibilidade e performance.

**1. Funcionalidades Principais:**  
- [x] **Página Inicial**: Exibe uma lista de artigos em destaque, artigos populares e outras notícias relevantes.  
- [x] **Componentes Reutilizáveis**:
   - `MenuBarComponent`: Barra de navegação com links para diferentes seções do blog.
   - `MenuTitleComponent`: Título do blog com estilização personalizada.
   - `BigCardComponent`: Componente para exibir o artigo principal em destaque.
   - `SmallCardComponent`: Componente para exibir artigos menores em uma lista.
   - `PopularCardComponent`: Componente para exibir uma lista de artigos populares.
   - `MenuFooterComponent`: Rodapé com links para redes sociais e outras páginas.  
- [x] **Responsividade**: O layout é responsivo e se adapta a diferentes tamanhos de tela.  
- [x] **Integração com APIs**: Possibilidade de integração com APIs para buscar e exibir artigos dinâmicos (futuro).  
- [x] **Boas Práticas de Código**: Utilização de boas práticas de desenvolvimento, como modularização, componentes reutilizáveis e estilização consistente.


**2. Requisitos:**
- [x] **Angular 14:** Utilizar a versão 14 do Angular para o desenvolvimento da aplicação.
- [x] **Componentização:** Dividir a aplicação em componentes reutilizáveis e bem estruturados.
- [x] **Deploy:** Configurar e realizar o deploy da aplicação no Vercel. O link da aplicação depois de realizado o deploy [https://techblog-news.vercel.app/](https://techblog-news.vercel.app/).

Este projeto é uma excelente oportunidade para praticar e aprimorar habilidades em Angular, desenvolvimento de front-end, testes unitários e deploy de aplicações web.

### 🖨️ Imagens do Projeto
<img width="350" src="">
<img width="350" src="">
<img width="350" src="">
<img width="350" src="">

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
git clone https://github.com/ItaloRochaj/techblog.git
```

Navegue até o diretório do projeto:
```
cd tech blog
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

**5. Deploy:**
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
