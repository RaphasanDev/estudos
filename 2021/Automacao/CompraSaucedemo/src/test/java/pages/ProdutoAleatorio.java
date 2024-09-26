package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class ProdutoAleatorio {
    WebDriver navegador;
    public ProdutoAleatorio(WebDriver navegador){
        this.navegador = navegador;
    }
    public void aleatorio(){
        Random aleatorio = new Random();
        int produto = aleatorio.nextInt(6);
        navegador.findElement(By.xpath("//*[@id='item_"+produto+"_img_link']")).click();
        navegador.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
        navegador.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }
}
