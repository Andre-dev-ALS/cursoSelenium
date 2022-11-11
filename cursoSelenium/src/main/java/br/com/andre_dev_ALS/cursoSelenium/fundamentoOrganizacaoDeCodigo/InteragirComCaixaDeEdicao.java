package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragirComCaixaDeEdicao {
private WebDriver driver;


@Before
public void iniciar() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
}
@AfterAll
public void finalizar() {
	driver.quit();
}

	@Test
	public void testeTextField() {
		

		

		driver.findElement(By.id("elementosForm:nome")).sendKeys("andré");
		Assert.assertEquals("andré", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
	}

	@Test
	public void deveIntegarirComTextArea() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste\n\naasldjdlks\nUltima linha");
		Assert.assertEquals("teste\n\naasldjdlks\nUltima linha",
				driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
	}
}
