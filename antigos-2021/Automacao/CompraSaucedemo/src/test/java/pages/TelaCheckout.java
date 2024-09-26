package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaCheckout {
    WebDriver navegador;
    public TelaCheckout(WebDriver navegador){
        this.navegador = navegador;
    }
    public void checkout(){
        navegador.findElement(By.xpath("//button[@id='checkout']")).click();
    }
}
