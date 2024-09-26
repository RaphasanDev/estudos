package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import support.Web;


public class InformacoesUsuarioTestv5ComPageObjects {
	private WebDriver navegador;
	
	
	@Before
	public void setUp() {
		navegador = Web.createChrome();
	}
	
	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
//		 String textoToast = new 
				  new LoginPage(navegador)
		.clickSignIn()
//		.typeLogin("raphasan")
//		.typePassword("081921")
//		.clicarSignIn()
//		.clicarMe()
//		.clicarAbaMoreDataAboutYou()
//		.clicarBotaoAddMoreDataAboutYou()
		//metodo estrutural
//			.escolherTipoDeContato("Phone")
//			.digitarContato("+551199999-1234")
//			.clickSalvar()
//		
		//metodo funcional
//		.adicionarContato("Phone", "+551199999-1234")
//		.capturarTextoToast()
//		;
//		assertEquals("Your contact has been added!", textoToast);
		
	;}
	
	
	@After
	public void tearDown() {
		// Fechar o Navegador
		//navegador.quit();
	}
}
