package br.com.andre_dev_ALS.cursoSelenium.basicoElementos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComJanelasSemNome {
@Test
public void  interagirComJanelaSemNome() {
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	driver.findElement(By.id("buttonPopUpHard")).click();
	driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
	driver.findElement(By.tagName("textarea")).sendKeys("Deu certo?");
	driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
	driver.findElement(By.tagName("textarea")).sendKeys("E agora?");
	driver.quit();
}	
}
