package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaBtnFinish {
    WebDriver navegador;
    public TelaBtnFinish(WebDriver navegador){
        this.navegador = navegador;
    }
    public void btn(){
        navegador.findElement(By.xpath("//button[@id='finish']")).click();
    }
}
