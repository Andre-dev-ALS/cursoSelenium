package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class InteragindoComTextosDaPagina {
	@Test
	public void capturandoTextos() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		Assert.assertEquals("Campo de Treinamento", driver.findElement(By.tagName("h3")).getText());

		Assert.assertEquals("Cuidado onde clica, muitas armadilhas...",
		driver.findElement(By.className("facilAchar")).getText());
		driver.quit();

	}
}
