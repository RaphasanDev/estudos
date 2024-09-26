package DesafioAutomacao;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class AplicacaoTest {

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raphael San\\Documents\\Programação\\Automacao\\drivers\\chromedriver.exe");
	}

	@Test
	public void TestarAcessoAoRastreioDoscorreios() {
		ChromeDriver driver = new ChromeDriver();
		// INSTANCIAR O OBJETO
		PageObject logar = new PageObject(driver);

		logar.homePage("https://www.saucedemo.com/");
		logar.login("standard_user", "secret_sauce");
		logar.chooseProduct();
		logar.checkOut();
		logar.yourInformation("Desafio", "Automaï¿½ï¿½o", "04455-130");
		logar.finish();
		logar.checkMessage("THANK YOU FOR YOUR ORDER");
		driver.quit();
	}

}
