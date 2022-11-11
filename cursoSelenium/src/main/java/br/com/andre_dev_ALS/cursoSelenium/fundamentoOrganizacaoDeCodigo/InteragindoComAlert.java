package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class InteragindoComAlert {
	@Test
	public void interagindoComAlert() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("alert")).click();
		Alert alerta = driver.switchTo().alert();
		String texto = alerta.getText();

		Assert.assertEquals("Alert Simples", texto);
		alerta.accept();
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Textando o campo");
		driver.quit();
	}
}
