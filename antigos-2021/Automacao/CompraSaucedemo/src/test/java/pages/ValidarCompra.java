package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidarCompra {
    WebDriver navegador;
    public ValidarCompra(WebDriver navegador){
        this.navegador = navegador;
    }
    public void validar(){
        WebElement ativo = navegador.findElement(By.xpath("//h2[@class='complete-header']"));
        String texto = ativo.getText();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", texto);
        System.out.println("================  "+texto+"  ==================");
    }
}
