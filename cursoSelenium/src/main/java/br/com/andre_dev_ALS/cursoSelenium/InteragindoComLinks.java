package br.com.andre_dev_ALS.cursoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComLinks {
@Test

public void interagindoComLink() {
	WebDriver  driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	driver.findElement(By.linkText("Voltar")).click();
	
	Assert.assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
	
	driver.quit();
}
}
