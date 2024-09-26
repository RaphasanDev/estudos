package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	@SuppressWarnings("deprecation")
	public static WebDriver createChrome() {
		// Abrindo Navegador

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raphael San\\Documents\\Programação\\Automacao\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Navegando para a página do TaskIt
		navegador.get("http://www.juliodelima.com.br/taskit");

		return navegador;
	}
}
