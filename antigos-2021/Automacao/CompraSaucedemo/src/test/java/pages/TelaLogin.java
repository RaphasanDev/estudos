package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaLogin {
    WebDriver navegador;
    public TelaLogin(WebDriver navegador){
        this.navegador = navegador;
    }
    public void login(){
        navegador.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        navegador.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        navegador.findElement(By.xpath("//input[@id='login-button']")).click();
    }
}
