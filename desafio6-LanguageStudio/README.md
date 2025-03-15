# 🤖 Uso do Azure Speech Studio e do Azure Language Studio

Este repositório corresponde ao Desafio #06 da [Bootcamp Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025) para fornecer instruções sobre como explorar o uso do Azure Speech Studio e a análise linguística proporcionada pelo Language Studio.

### Índice
- [Desafio de Projeto](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio6-LanguageStudio#-desafio-de-projeto)
- [Tecnologias Utilizadas](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio6-LanguageStudio#%EF%B8%8F-tecnologias-utilizadas)
- [Instruções de Uso](https://github.com/ItaloRochaj/decola-tech-2025/tree/main/desafio6-LanguageStudio#%EF%B8%8F-intru%C3%A7%C3%B5es-de-uso)

### 🎯 Desafio de Projeto
Durante a prática, teremos a oportunidade de aprofundar nosso entendimento sobre como aproveitar essas ferramentas avançadas da Microsoft Azure. Estaremos focados em aprimorar nossas habilidades na implementação de soluções de análise de fala e linguagem, abrindo portas para uma compreensão mais ampla e prática das capacidades oferecidas por essas tecnologias inovadoras.

### 🛠️ Tecnologias Utilizadas
|  |
|-------------|
| <a href="https://azure.microsoft.com/pt-br/"><img src="https://skillicons.dev/icons?i=azure" alt="azure"/></a>

### ▶️ Intruções de Uso

**1. Introdução:**  
Este guia descreve como utilizar o `Azure Speech Studio` para tarefas relacionadas à fala e o `Azure Language Studio` para análise linguística, incluindo mineração de sentimentos e opiniões.

**2. Pré-requisitos:**  
Antes de começar, verifique se você possui:
- Uma conta ativa no Azure.
- Acesso aos recursos do Azure Speech Studio e Language Studio.
- Conhecimentos básicos de serviços do Azure.

**3. Passo a Passo:**  
- **Acessando o Azure Speech Studio**
1. Vá até o portal do Azure [portal.azure.com](https://portal.azure.com) e faça login.
2. Pesquise por `Speech Studio` e selecione o serviço nos resultados.
3. Explore recursos como `Conversão de Fala em Texto`, `Texto em Fala` e `Tradução de Fala`.  
![print1](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print1.png)

- **Criando um Recurso de Fala**
1. No Speech Studio, clique em **"Criar um recurso"**.
2. Preencha os detalhes necessários, como assinatura, grupo de recursos e região.
3. Escolha o plano de preços apropriado.
4. Clique em **"Revisar + criar"** e depois em **"Criar"**.  
![print2](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print2.png)

- **Acessando o Azure Language Studio**
1. No portal do Azure, pesquise por `Language Studio`.
2. Selecione o serviço `Language Studio`.
3. Explore funcionalidades como análise de sentimentos, extração de frases-chave e detecção de idioma.  
![print3](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print3.png)

Mineração de Sentimentos e Opiniões no Language Studio  
- **Configurando a Análise**
1. Acesse o recurso **"Sentiment and opinion mining tryout"**.
2. Escolha o idioma do texto no menu suspenso (ex.: inglês ou português).
3. Conecte-se a um recurso Azure (plano gratuito F0 recomendado).
4. Insira o texto a ser analisado na caixa de texto. Você também pode usar arquivos ou textos de exemplo.  
![print4](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print4.png)

- **Habilitando a Mineração de Opiniões**
1. Ative a opção **"Opinion mining"** para obter análises detalhadas sobre palavras ou atributos específicos.
2. Clique em **"Analyze"** para processar o texto.  
![print5](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print5.png)

- **Interpretando os Resultados**
- Sentimentos são classificados como **negativo**, **neutro** ou **positivo**.
- As pontuações de confiança aparecem em níveis de sentença e documento.
- Caso a mineração de opinião esteja ativada, veja insights detalhados sobre palavras e atributos analisados.  
![print6](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print6.png)

### Exemplo de Saída de Análise

Aqui está um exemplo de saída JSON gerada pela análise de sentimentos:

```json
{
    "documents": [
        {
            "id": "id__1177",
            "sentiment": "negative",
            "confidenceScores": {
                "positive": 0,
                "neutral": 0,
                "negative": 1
            },
            "sentences": [
                {
                    "sentiment": "negative",
                    "confidenceScores": {
                        "positive": 0,
                        "neutral": 0,
                        "negative": 1
                    },
                    "offset": 0,
                    "length": 220,
                    "text": "Tired hotel with poor service ...",
                    "targets": [
                        {
                            "sentiment": "negative",
                            "confidenceScores": {
                                "positive": 0.02,
                                "negative": 0.98
                            },
                            "offset": 7,
                            "length": 5,
                            "text": "hotel"
                        }
                    ]
                }
            ]
        }
    ],
    "errors": [],
    "modelVersion": "2025-01-01"
}
```
![print7](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print7.png)
![print8](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print8.png)
![print9](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print9.png)
![print10](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print10.png)

**4. Guia de Uso do Speech Studio:**
Este guia fornece instruções detalhadas sobre como acessar e utilizar o Speech Studio da Microsoft para conversão de fala em texto. Siga os passos abaixo para configurar e usar o serviço.

**1. Acessar a Página Inicial do Speech Studio**  
   Acesse a página inicial do Speech Studio e clique no ícone de configurações na lateral da barra de navegação.  
   ![print11](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print11.png)

**2. Criar um Novo Recurso**  
   Se você não tiver nenhum recurso criado anteriormente, crie um novo clicando no botão **"+ Criar novo recurso"**.  
   ![print12](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print12.png)

**3. Definir Configurações do Recurso**  
   - Defina um nome para o recurso.
   - Mantenha sua opção de assinatura.
   - Utilize a região "East US" para evitar instabilidades.
   - Mantenha "Padrão SO" em "Tipo de preço".
   - Selecione um grupo de recursos.
   - Clique em **"Criar um recurso"**.  
    ![print13](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print13.png)

**4. Selecionar e Usar o Recurso**  
   Selecione o recurso criado e clique em **"Usar o recurso"**.  
   ![print14](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print14.png)

**5. Conversão de Fala em Texto**  
   Navegue até a seção **"Conversão de fala em texto em tempo real"** e selecione essa opção.  
   ![print15](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print15.png)

**6. Configurar Reconhecimento de Recursos**  
   Selecione o idioma do áudio e ative o reconhecimento de recursos.  
   ![print16](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print16.png)

**7. Visualizar Arquivos de Áudio e Resultados de Teste**  
   - Na seção **"Arquivos de áudio"**, você encontrará os áudios já transcritos.
   - Na seção **"Resultados de teste"**, em "Texto", você verá a transcrição em tempo real.
   ![print17](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print17.png)

**8. Visualizar Código JSON**  
   A transcrição gerada também pode ser visualizada na aba `JSON`.  
   ![print18](https://github.com/ItaloRochaj/decola-tech-2025/blob/main/desafio6-LanguageStudio/assets/print18.png)

Com este guia, você aprendeu a utilizar o **Azure Speech Studio** para conversão de fala em texto e o **Azure Language Studio** para análises avançadas de texto, como mineração de sentimentos e opiniões. Essas ferramentas fornecem um poder computacional incrível para enriquecer suas aplicações com inteligência artificial e automação linguística. Para mais informações, consulte a [documentação oficial do Azure Speech Studio](https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/) e do [Azure Language Studio](https://learn.microsoft.com/en-us/azure/ai-services/language-service/).

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
