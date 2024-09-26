package Tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Aprimoramento do anterior inserindo o 
										//@BeforeClass: Método público, sem retorno e estático usado para executar comandos antes da execução do primeiro teste contido no projeto.
										//@AfterClass: Método público, sem retorno e estático usado para executar comandos depois da execução do último teste contido no projeto.

public class InformacoesUsuarioTestv2 {
	private WebDriver navegador; // Criar a variável para ficar exposta a todos os outros trechos do código
	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		// Abrindo Navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raphael San\\Documents\\Programa��o\\Automacao\\drivers\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Navegando para a página do TaskIt
		navegador.get("http://www.juliodelima.com.br/taskit");
	}
	
	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario() {

		// Clicar no link que possui o texto "Sign In"
		navegador.findElement(By.linkText("Sign in")).click();

		// Identificando o formulario de login
		WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

		// Digitar no campo com nome "Login" que está dentro do formulário de id "signinbox" o texto "raphasan"
		formularioSignInBox.findElement(By.name("login")).sendKeys("raphasan");

		// Digitar no campo com nome "password" que está dentro do formulário de id "signinbox" o texto "081921"
		formularioSignInBox.findElement(By.name("password")).sendKeys("081921");

		// Clicar no link com o texto "SIGN IN"
		navegador.findElement(By.linkText("SIGN IN")).click();

		// Clica em um link que possui a class "me"
		navegador.findElement(By.className("me")).click();
		
		// Clicar em um link que possui o texto "MORE DATA ABOUT YOU"
		navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
		
		// Clicar no botão através do seu xpath //button[@data-target="addmoredata"]
		navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();
		
		// Identificar o popup onde está o formulário de id addmoredata
		WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));
		
		// Na combo de name "type" escolhe a opção "Phone"
		WebElement campoType =  popupAddMoreData.findElement(By.name("type"));
		new Select(campoType).selectByVisibleText("Phone");
		
		// No campo de name "contact" digitar o "+551199999-1234"
		popupAddMoreData.findElement(By.name("contact")).sendKeys("551199999-1234");
		
		// Clicar no link de text "SAVE" que está na popup
		popupAddMoreData.findElement(By.linkText("SAVE")).click();
		
		// Na mensagem de id "toast-container" validar que o texto é "Your contact has been added!"
		WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
		String mensagem = mensagemPop.getText();
		assertEquals("Your contact has been added!", mensagem);
		

		}
	
	//@Test
	public void removerUmContatodeUmUsuario() {
		// Logar na aplicação
				
		//Clicar no menu Hi, Raphael Santos
		
		// Ir para o addmoredata
		
	}
	
	@After
	public void tearDown() {
		// Fechar o Navegador
			//navegador.quit();
	}
}
