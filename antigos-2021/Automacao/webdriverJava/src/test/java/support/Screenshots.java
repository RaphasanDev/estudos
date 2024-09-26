package support;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
public static void tirar(WebDriver navegador, String arquivo) {
	File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
	try{
	FileHandler.copy(screenshot, new File(arquivo));
	}catch (Exception e) {
		System.out.println("Houve um erro ao copiar o arquivo para a pasta" + e.getMessage());
	}
}
}
