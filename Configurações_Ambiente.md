# Configurações do ambiente de teste

## Pré-Requisitos

 * Eclipse IDE instalado.
 * Java 8 development kit (JDK) instalado e configurado.
 * Driver do Firefox: geckodriver.
 * Driver do Google Chrome: chromedriver.
 * Driver do Internet Explorer: IEDriverServer.

## Configurações para o sistema operacional Windows 10

### 1. Instalação do Eclipse IDE

* Download do [Eclipse](https://www.eclipse.org/downloads/)
* Descompactar e abrir o executável.


### 2. Instalação do Java JDK 8

- Download do instalador do [Java JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads)
- Aceitar a licença clicando em "Accept License Agreement".
- Clicar no link para download referente ao seu sistema operacional (Windows x64).
- Após o download, executar a instalação (*next, next, finish*).


### 3. Configuração das variáveis de ambiente

- Adicionar *JAVA_HOME* nas variáveis de ambiente:

    * Meu Computador > Botão direito: Propriedades > Configurações avançadas do sistema;
    * Propriedades do sistema: Aba 'Avançado' > Botão "Variáveis do ambiente";
    * Na área "Variáveis do sistema", clicar no botão 'Novo...';
    * Na janela "Nova variável de sistema", preencher o campo 'Nome da variável' com *JAVA_HOME* e o campo 'Valor da variável' com o caminho do diretório onde o Java foi instalado.

- Atualizar o *PATH* das variáveis de ambiente:
    * Ainda na área "Variáveis do sistema", selecionar a variável "Path" > botão Editar.
    * Acrescentar ao final das configurações > *;%JAVA_HOME%\bin* > botão OK.

### 4. Validar a configuração das variáveis de ambiente

- Acessar o prompt de comando e digitar:

```
java -version
```

> O sistema deve apresentar a versão do Java instalada.

- Ainda no prompt de comando, digitar:

```
javac -version
```

> O sistema deve apresentar a versão do compilador Java instalada.

### 5. Drivers dos browsers

* Download do [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/home)

* Download do [GeckoDriver](https://github.com/mozilla/geckodriver/releases)

* Download do [IEDriverServer](https://www.seleniumhq.org/download/)

* Extrair os arquivos no diretório C:\Windows

* Alterar o PATH do Windows informando o diretório onde os drivers foram descompactados e clicar em Salvar.


### 6. Projeto Maven

* Criar um projeto MAVEN através do Eclipse IDE em File > New > Other > Maven > Maven Project > opção "Create a simple project".

* Informar o Group id (link da empresa), o Artfact id (nome do projeto) > botão Finish.


### 7. Atualizar o arquivo POM.xml

* Para adicionar as bibliotecas do Selenium Webdriver e suas dependências, digitar no arquivo *"POM.xml"*:

```
<dependencies>
  	<dependency>
  		<groupId>org.seleniumhq.selenium</groupId>
  		<artifactId>selenium-java</artifactId>
  		<version>3.4.0</version>
  	</dependency>
</dependencies>
```

## License

MIT License © Luciana Muniz Freire.