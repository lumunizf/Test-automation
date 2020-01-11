# Test Automation

![GitHub](https://img.shields.io/github/license/lumunizf/test-automation?style=flat)
![GitHub issues](https://img.shields.io/github/issues/lumunizf/test-automation)
![GitHub commit activity](https://img.shields.io/github/commit-activity/m/lumunizf/Test-automation)
[![Twitter: @lumunizf](https://img.shields.io/badge/Contact-@lumunizf-blueviolet.svg?style=flat)](https://twitter.com/lumunizf) 
![Twitter Follow](https://img.shields.io/twitter/follow/lumunizf?label=Follow&style=flat)
![Website](https://img.shields.io/website?url=https://medium.com/@lumunizf)


-------
<p align="center">
    <a href="#motivação">Motivação</a> &bull;
    <a href="#requisitos">Requisitos</a> &bull;
    <a href="#configuração">Configuração</a> &bull;
    <a href="#testes">Testes</a> &bull;
    <a href="#license">Licença</a>
</p>

-------

## Motivação

Este repositório nasceu da necessidade de encontrar exercícios de automação de testes próximos da realidade no dia a dia das empresas.
Procurei reunir neste espaço os exercícios de automação de testes que realizei utilizando o Selenium Webdriver com Java.



## Requisitos

 * Java development kit (JDK 8).
 * Eclipse IDE - Versão Photon - Release 4.8.0.
 * Maven - Versão 
 * Selenium Webdriver - Versão 
 * JUnit - Versão
 * Driver Firefox: geckodriver.
 * Driver Google Chrome: chromedriver.
 * Driver Internet Explorer: IEDriverServer.

 
## Configuração

### 1. Instalação do Eclipse IDE

* Download do [Eclipse](https://www.eclipse.org/downloads/)
* Descompactar o arquivo e clicar sobre o executável para iniciar a instalação.


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



## Testes

You can run the tests any time. All your need to do is:
```
bundle exec fastlane test
```

## License


Este projeto está licenciado sob os termos da **MIT License** © [Luciana Muniz Freire](https://br.linkedin.com/in/lumunizf).
Para mais informações leia o arquivo de [LICENÇA](https://github.com/lumunizf/Test-automation/blob/master/LICENSE).