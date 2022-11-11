package br.com.andre_dev_ALS.cursoSelenium.basicoElementos;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComFrames {
@Test
public void interagirComFrames() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	driver.switchTo().frame("frame1");
	driver.findElement(By.id("frameButton")).click();
	Alert alerta = driver.switchTo().alert();
Assert.assertEquals("Frame OK!", alerta.getText());
	alerta.accept();
	
	driver.switchTo().defaultContent();
	driver.findElement(By.id("elementosForm:nome")).sendKeys("Testando o campo");
	driver.quit();
}
}
