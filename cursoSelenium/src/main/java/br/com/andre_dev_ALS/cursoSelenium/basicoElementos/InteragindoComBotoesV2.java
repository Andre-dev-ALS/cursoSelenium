package br.com.andre_dev_ALS.cursoSelenium.basicoElementos;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class InteragindoComBotoesV2 {
@Test
public void InteragindoComBotao() {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	WebElement botao = driver.findElement(By.id("buttonSimple"));
	botao.click();
	Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
	
driver.quit();
}
}
