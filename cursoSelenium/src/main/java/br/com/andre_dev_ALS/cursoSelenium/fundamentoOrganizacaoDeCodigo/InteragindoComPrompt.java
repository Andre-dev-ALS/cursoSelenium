package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComPrompt {
	@Test
	public void interagirComPrompt() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		Assert.assertEquals("Digite um numero", prompt.getText());
		prompt.sendKeys("31");
		prompt.accept();
		Assert.assertEquals("Era 31?", prompt.getText());
		prompt.accept();
		Assert.assertEquals(":D", prompt.getText());

		prompt.accept();
		driver.quit();
	}
}
