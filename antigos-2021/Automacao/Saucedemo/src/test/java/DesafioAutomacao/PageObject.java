package DesafioAutomacao;


import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {

	private WebDriver driver;

	public PageObject(WebDriver driver) {
		this.driver = driver;
	}

	public PageObject homePage(String url) {
		driver.get(url);
		return this;
	}

	public PageObject login(String user, String password) {
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login-button")).click();
		return new PageObject(driver);
	}

	public void chooseProduct() {
		Random aleatorio = new Random();
        int produto = aleatorio.nextInt(5);
        driver.findElement(By.id("item_"+produto+"_title_link")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button")).click();
		return;
	}

	public void checkOut() {
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
	}

	public PageObject yourInformation(String firstName, String lastName, String zipCode) {
		driver.findElement(By.id("first-name")).sendKeys(firstName);
		driver.findElement(By.id("last-name")).sendKeys(lastName);
		driver.findElement(By.id("postal-code")).sendKeys(zipCode);
		driver.findElement(By.id("continue")).click();
		return new PageObject(driver);
	}

	public void finish() {
		driver.findElement(By.id("finish")).click();
	}

	public void checkMessage(String pageMsg) {
		String msg = driver.findElement(By.className("complete-header")).getText();	
		Assert.assertEquals(pageMsg, msg);

	}
	@After
	public void teadDown() {
		// Fechar o navegagor
		driver.quit();
	}
}