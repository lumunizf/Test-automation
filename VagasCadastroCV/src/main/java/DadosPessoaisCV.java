import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DadosPessoaisCV {
	private WebDriver wd;
	
	@Before
	public void setUp() {
		//Alterar para o caminho onde o chromedriver foi salvo
		System.setProperty("webdriver.chrome.driver", "/Users/lumun/Drivers/chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
		//Fazer o login no site do Vagas.com
		wd.get("https://www.vagas.com.br/login-candidatos");
		WebElement campoUsuario = wd.findElement(By.id("login_candidatos_form_usuario"));
		campoUsuario.sendKeys("sdanete");
		wd.findElement(By.id("login_candidatos_form_senha")).sendKeys("123456");
		wd.findElement(By.className("submit")).click();
		
		//Confirmar se o usuário logado no sistema está correto
		String saudacao = wd.findElement(By.className("nome")).getText();
		Assert.assertEquals("Danete", saudacao);
	}

	@Test	
	public void loginSenhaIncorreta(){
		//Abrir o browser
		System.setProperty("webdriver.chrome.driver", "/Users/lumun/Drivers/chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait wda = new WebDriverWait(wd, 10);
				
		//Fazer o login no site do Vagas.com - senha incorreta
		wd.get("https://www.vagas.com.br/login-candidatos");
		WebElement campoUsuario = wd.findElement(By.id("login_candidatos_form_usuario"));
		campoUsuario.sendKeys("sdanete");
		wd.findElement(By.id("login_candidatos_form_senha")).sendKeys("abcdef");
		wd.findElement(By.className("submit")).click();
		wda.until(ExpectedConditions.presenceOfElementLocated(By.className("alert-danger")));
		wd.quit();
	}
	
	@Test	
	public void dadosPessoais(){		
		//Acessar a seção de dados pessoais
		wd.findElement(By.className("edit-btn")).click();
		wd.findElement(By.className("open-box")).click();
		
		//Preencher o combo Estado Civil
		WebElement ecivil = wd.findElement(By.id("dados_pessoais_estado_civil"));
		Select combo1 = new Select(ecivil);
		combo1.selectByVisibleText("Viúvo(a)");
		
		//Preencher o combo País de Nacionalidade
				WebElement nacionalidade = wd.findElement(By.id("dados_pessoais_pais_de_nacionalidade"));
				Select combo2 = new Select(nacionalidade);
				combo2.selectByVisibleText("Brasil");
				
		//Salvar as informações do usuário
				wd.findElement(By.className("btnSaveBox")).click();				
	}
	
	@Test	
	public void endereco(){
		//Acessar a seção Endereço
				wd.findElement(By.className("edit-btn")).click();
				wd.findElement(By.id("cv-endereco")).findElement(By.className("open-box")).click();
				
		//Preencher o combo País
				WebElement pais = wd.findElement(By.id("endereco_pais_id"));
				Select combo3 = new Select(pais);
				combo3.selectByVisibleText("Brasil");
				
		//Preencher o campo CEP
				WebElement cep = wd.findElement(By.id("endereco_cep"));
				cep.sendKeys("04550-000");
				
		//Preencher o combo Estado
				WebElement estado = wd.findElement(By.id("endereco_uf_id"));
				Select combo4 = new Select(estado);
				combo4.selectByVisibleText("São Paulo");
				
		//Preencher o combo Cidade
				WebElement cidade = wd.findElement(By.id("endereco_cidade_id"));
				Select combo5 = new Select(cidade);
				combo5.getOptions();
				combo5.selectByVisibleText("São Paulo");
				
		//Preencher o campo Bairro
				WebElement bairro = wd.findElement(By.id("endereco_bairro"));
				bairro.sendKeys("Vila Olímpia");
				
		//Preencher o campo Endereço
				WebElement end = wd.findElement(By.id("endereco_logradouro"));
				end.sendKeys("Rua Alvorada, 230");
				
		//Salvar as informações do usuário
				wd.findElement(By.className("btnSaveBox")).click();							
	}
				
	@Test	
	public void informacoesDeContato(){
		//Acessar a seção de Informações de Contato
				wd.findElement(By.className("edit-btn")).click();
				wd.findElement(By.id("informacoes-de-contato")).findElement(By.className("open-box")).click();
				
		//Preencher o campo Telefone
				WebElement end = wd.findElement(By.id("informacoes_de_contato_telefone_numero"));
				end.sendKeys("11 9999-9999");
				
		//Preencher o campo Telefone Celular
				WebElement celular = wd.findElement(By.id("informacoes_de_contato_celular_pais_id"));
				Select combo6 = new Select(celular);
				combo6.getOptions();
				combo6.selectByVisibleText("Brasil");
				WebElement ddd = wd.findElement(By.id("informacoes_de_contato_celular_ddd"));
				ddd.sendKeys("11");				
				WebElement tcelular = wd.findElement(By.id("informacoes_de_contato_celular_numero"));
				tcelular.sendKeys("99999-9999");
				
		//Salvar as informações do usuário
				wd.findElement(By.className("btnSaveBox")).click();					
	}
	
	@Test	
	public void linksRedesSociais(){
		//Acessar a seção de Links e Redes Sociais
				wd.findElement(By.className("edit-btn")).click();
				wd.findElement(By.id("redes")).findElement(By.className("open-box")).click();
				
		//Preencher o endereço com o perfil das Redes Sociais
				WebElement rede2 = wd.findElement(By.id("sites_pessoal"));
				rede2.sendKeys("http://pudim.com.br/");				
				WebElement rede3 = wd.findElement(By.id("sites_outro"));
				rede3.sendKeys("https://twitter.com/JoannaBugger");
				
		//Salvar as informações do usuário
				wd.findElement(By.className("btnSaveBox")).click();				
	}
	
	@Test	
	public void deficiencias(){
		//Acessar a seção de Deficiências
				wd.findElement(By.className("edit-btn")).click();
				wd.findElement(By.id("deficiencias")).findElement(By.className("open-box")).click();
				
		//Informar se possui deficiência
				wd.findElement(By.id("deficiencias_possui_alguma_deficiencia_true")).click();
				Assert.assertTrue(wd.findElement(By.id("deficiencias_possui_alguma_deficiencia_true")).isSelected());
				
		//Informar o tipo de deficiência
				wd.findElement(By.id("deficiencias_possui_deficiencia_fala")).click();
				Assert.assertTrue(!wd.findElement(By.id("deficiencias_tipo_de_deficiencia_fala")).isSelected());
				WebElement deficiencia = wd.findElement(By.id("deficiencias_tipo_de_deficiencia_fala"));
				Select combo7 = new Select(deficiencia);
				combo7.getOptions();
				combo7.selectByVisibleText("Grandes alterações na fala");
				
		//Salvar as informações do usuário
				wd.findElement(By.className("btnSaveBox")).click();							
	}
	
	@After
	public void tearDown() {
		//Fechar o browser
		wd.quit();
	}
}
