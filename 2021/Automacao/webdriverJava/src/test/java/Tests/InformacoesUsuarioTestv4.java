package Tests;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import support.Generator;
import support.Screenshots;

//Aprimoramento do anterior inserindo a biblioteca Easy Test para alimentação com massa de dados externa para os testes
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioTestData.csv")

//Aprimoramento do anterior inserindo os itens que podem ser utilizados em mais de um teste no @Before
public class InformacoesUsuarioTestv4 {
	private WebDriver navegador; // Criar a variável para ficar exposta a todos os outros trechos do código
	
	@Rule
	public TestName test = new TestName();
		
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

		// Clicar no link que possui o texto "Sign In"
		navegador.findElement(By.linkText("Sign in")).click();

		// Identificando o formulario de login
		WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

		// Digitar no campo com nome "Login" que está dentro do formulário de id
		// "signinbox" o texto "raphasan"
		formularioSignInBox.findElement(By.name("login")).sendKeys("raphasan");

		// Digitar no campo com nome "password" que está dentro do formulário de id
		// "signinbox" o texto "081921"
		formularioSignInBox.findElement(By.name("password")).sendKeys("081921");

		// Clicar no link com o texto "SIGN IN"
		navegador.findElement(By.linkText("SIGN IN")).click();

		// Clica em um link que possui a class "me"
		navegador.findElement(By.className("me")).click();

		// Clicar em um link que possui o texto "MORE DATA ABOUT YOU"
		navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
	}

	//@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario(@Param(name="tipo")String tipo, @Param(name="contato")String contato, @Param(name="mensagem")String mensagemEsperada) {
		// Clicar no botão através do seu xpath //button[@data-target="addmoredata"]
		navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

		// Identificar o popup onde está o formulário de id addmoredata
		WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

		// Na combo de name "type" escolhe a opção "Phone"
		WebElement campoType = popupAddMoreData.findElement(By.name("type"));
		new Select(campoType).selectByVisibleText(tipo);

		// No campo de name "contact" digitar o "+551199999-1234"
		popupAddMoreData.findElement(By.name("contact")).sendKeys(contato);

		// Clicar no link de text "SAVE" que está na popup
		popupAddMoreData.findElement(By.linkText("SAVE")).click();

		// Na mensagem de id "toast-container" validar que o texto é "Your contact has
		// been added!"
		WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
		String mensagem = mensagemPop.getText();
		assertEquals(mensagemEsperada, mensagem);
		String screenshotArquivo = "C:\\Users\\Sempre IT\\Documents\\EstudoAutomacao\\webdriverJava\\src\\PrintsWebDriverJava\\" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
		Screenshots.tirar(navegador, screenshotArquivo);

	}

	@Test
	public void removerUmContatodeUmUsuario() {
		// Clicar no elemento pelo seu xpath //span[text()='+551198756413']/following-sibling::a
		navegador.findElement(By.xpath("//span[text()='+551198756413']/following-sibling::a")).click();
		
		
		// Confirmar a janela javascript
		navegador.switchTo().alert().accept();
		
		// Validar que a mensagem apresentada foi Rest in peace, dear phone!
		WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
		String mensagem = mensagemPop.getText();
		assertEquals("Rest in peace, dear phone!", mensagem);
		
		String screenshotArquivo = "C:\\Users\\Sempre IT\\Documents\\EstudoAutomacao\\PrintsWebDriverJava\\" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
		Screenshots.tirar(navegador, screenshotArquivo);
		
		// Aguardar até 10 segundo para que a janela desapareça
		WebDriverWait aguardar = new WebDriverWait(navegador, Duration.ofSeconds(10));
		aguardar.until(ExpectedConditions.stalenessOf(mensagemPop));
		
		// Clicar no link com texto "Logout"
		navegador.findElement(By.linkText("Logout")).click();
											 
	}

	@After
	public void tearDown() {
		// Fechar o Navegador
		navegador.quit();
	}
}
