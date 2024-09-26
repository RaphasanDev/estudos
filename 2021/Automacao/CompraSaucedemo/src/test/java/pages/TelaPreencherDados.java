package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaPreencherDados {
    WebDriver navegador;
    public TelaPreencherDados(WebDriver navegador){
        this.navegador = navegador;
    }
    public void dados(){
        navegador.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Estudo");
        navegador.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Automação 2022");
        navegador.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("04455-130");
        navegador.findElement(By.xpath("//input[@id='continue']")).click();

    }
}
