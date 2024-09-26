package pages;

import org.openqa.selenium.WebDriver;

public class Url {
    WebDriver navegador;
    public Url(WebDriver navegador){
        this.navegador = navegador;
    }
    public void site(){
        navegador.get("https://www.saucedemo.com");
    }
}
