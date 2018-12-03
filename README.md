# Test-automation with Selenium Webdriver

### Pré-Requisitos

 * Eclipse IDE instalado.
 * Java development kit (JDK) 8 instalado e configurado.
 * Driver do Firefox: geckodriver.
 * Driver do Google Chrome: chromedriver.

### Configuração do ambiente (Windows)

1. **Instalação do Eclipse IDE**

* Download do [Eclipse](https://www.eclipse.org/downloads/)
* Descompactar e abrir o executável.


2. **Instalação do Java JDK 8**

- Download do instalador do [Java JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads)
- Aceitar a licença clicando em "Accept License Agreement".
- Clicar no link para download referente ao seu sistema operacional (Windows x64).
- Após o download, executar a instalação (next, next, finish).


3. **Configuração das variáveis de ambiente**

- Atualizar o PATH do Windows:
    * Meu Computador > Botão direito: Propriedades
    * Configurações avançadas do sistema
    * Propriedades do sistema: Aba 'Avançado'
    * Botão "Variáveis do ambiente"
    * Na área "Variáveis do sistema", clicar no botão 'Novo...'
    * Na janela "Nova variável de sistema", preencher o campo 'Nome da variável' com *JAVA_HOME* e o campo 'Valor da variável' com o caminho do diretório onde o Java foi instalado.
    * Ainda na área "Variáveis do sistema", selecionar a variável "Path" > botão Editar.
    * Acrescentar no final > *;%JAVA_HOME%\bin* > botão OK.

4. **Instalação dos drivers**

* Download do [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/home)

* Download do [GeckoDriver](https://github.com/mozilla/geckodriver/releases)

* Download do [MicrosoftWebDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)

* Extrair os arquivos no diretório C:\Windows

* Alterar o PATH do Windows informando o diretório onde os drivers foram descompactados e clicar em Salvar.


### License

MIT License © Luciana Muniz Freire.