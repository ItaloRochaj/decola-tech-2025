# 🤖 Azure Cognitive Search: Utilizando AI Search para indexação e consulta de Dados

Este repositório corresponde ao Desafio #07 da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025) para fornecer instruções sobre como aplicar técnicas de organização de documentos e conduzir pesquisas eficientes através da ingestão de dados, seguindo três passos essenciais: `ingestão de conhecimento de IA`, `criação do índice correspondente` e `exploração dessas funcionalidades`.

### Índice
- [Desafio de Projeto]()
- [Tecnologias Utilizadas]()
- [Instruções de Uso]()

### 🎯 Desafio de Projeto
Nesta prática aplicaremos técnicas de organização de documentos e conduziremos pesquisas eficientes através da ingestão de dados, seguindo três passos essenciais: ingestão de conhecimento de IA, criação do índice correspondente e exploração dessas funcionalidades. Ao final, ganharemos uma visão prática das potencialidades oferecidas por essas ferramentas na mineração de conhecimento.

### 🛠️ Tecnologias Utilizadas
|  |
|-------------|
| <a href="https://azure.microsoft.com/pt-br/"><img src="https://skillicons.dev/icons?i=azure" alt="azure"/></a>

### ▶️ Intruções de Uso

**1. Introdução:**  
O Azure Cognitive Search é um serviço de pesquisa baseado em nuvem que utiliza inteligência artificial para indexação e consulta de dados. Neste guia, configuraremos uma pesquisa utilizando `AI Search`, explorando suas funcionalidades e insights.
 
**2. Pré-requisitos:**  
Antes de iniciar a configuração, certifique-se de ter:
- Uma conta ativa no `Microsoft Azure`.
- Um recurso `Azure Cognitive Search` criado.
- Dados para indexação (JSON, CSV, ou Banco de Dados conectado ao Azure).
- Conhecimento básico em `Azure Portal` e `API REST/SDK`.

![print]()

- **Criando um Serviço de Pesquisa no Azure**
1. Acesse o [Portal do Azure](https://portal.azure.com) e faça login.
2. Pesquise por `Cognitive Search` e clique em **Criar**.
3. Defina:
   - **Nome do Serviço**
   - **Grupo de Recursos**
   - **Localização** (preferencialmente "East US")
   - **Plano de Preço** (Free para testes, Standard ou superior para produção)
4. Clique em **Revisar + Criar** e confirme a criação do serviço.

- **Criando uma Conta de Armazenamento no Azure**
1. No portal do Azure, pesquise por `Storage Account` e clique em **Criar**.
2. Escolha um **Grupo de Recursos** existente ou crie um novo.
3. Defina:
   - **Nome da Conta de Armazenamento**
   - **Localização**: Recomenda-se "East US" para melhor desempenho.
   - **Desempenho**: Selecione "Standard".
   - **Redundância**: Escolha "LRS".
4. Clique em **Examinar + Criar** e finalize a criação.

- **Configurando a Conta de Armazenamento**
1. Acesse o recurso criado e clique em **Configuração**.
2. Ative a opção **Permitir acesso anônimo ao Blob** e salve.
3. No menu lateral, clique em **Contêineres**.
4. Crie um novo contêiner e defina as permissões públicas conforme necessário.
5. Carregue os arquivos de dados para indexação.

- **Importando Dados para o Azure Cognitive Search**
1. Acesse o **Azure Cognitive Search** e clique em **Importar dados**.
2. Selecione **Armazenamento de Blob do Azure** como fonte de dados.
3. Configure a conexão com a conta de armazenamento criada.
4. Escolha os dados a serem indexados.
5. Na seção "Adicionar enriquecimentos", expanda e ative opções avançadas, se necessário.
6. Clique em **Avançar** e confirme a importação dos dados.

- **Criando e Executando uma Pesquisa**
1. No Azure Cognitive Search, acesse **Gerenciador de Pesquisa**.
2. Utilize a ferramenta de pesquisa integrada para realizar consultas.
3. Insira palavras-chave e execute a pesquisa.
4. Os resultados serão apresentados no formato JSON.

- **Insights e Benefícios do AI Search**  
[x] **Análise Semântica**: melhora a precisão das pesquisas.  
[x] **Sugestões Inteligentes**: autocomplete e sugestões de busca baseadas em IA.  
[x] **Relevância Personalizada**: ajuste do ranking de resultados conforme necessidade.  
[x] **Facilidade de Integração**: compatível com aplicativos web e mobile.  

- **Ferramentas que se Beneficiam do Azure Cognitive Search**  
[x] **E-commerce**: busca de produtos baseada em relevância.  
[x] **Sistemas de Suporte**: pesquisas inteligentes em bases de conhecimento.  
[x] **Análise de Documentos**: indexação e busca avançada de documentos.  
[x] **Pesquisa Acadêmica**: mineração de conhecimento em artigos científicos.  

- **Aprendizados Durante o Processo**
Durante a implementação do ´Azure Cognitive Search`, aprendemos a:
1. Criar e configurar um serviço de pesquisa na nuvem.
2. Indexar diferentes tipos de fontes de dados.
3. Construir consultas eficientes para explorar os dados.
4. Utilizar técnicas de AI Search para otimizar a experiência de pesquisa.

Com esse guia, você configurou um serviço de pesquisa no `Azure Cognitive Search`, criou um repositório de dados, indexou arquivos e realizou buscas eficientes. Essa solução pode ser aplicada em diversos cenários, como buscas empresariais, análise de documentos e mineração de conhecimento.

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