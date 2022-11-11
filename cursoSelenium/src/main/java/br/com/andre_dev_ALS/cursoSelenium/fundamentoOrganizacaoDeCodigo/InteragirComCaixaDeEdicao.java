package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragirComCaixaDeEdicao {
WebDriver driver;
Dsl dsl;

@Before
public void iniciar() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	dsl = new Dsl(driver);
}

@After
public void finalizar() {
	driver.quit();
}

	@Test
	public void testeTextField() {

		dsl.escrever("elementosForm:nome", "André");
		assertEquals("André", dsl.obterValorCampo("elementosForm:nome"));
	}

	@Test
	public void deveIntegarirComTextArea() {
		dsl.escrever("elementosForm:sugestoes", "teste\n\naasldjdlks\nUltima linha");
		Assert.assertEquals("teste\n\naasldjdlks\nUltima linha", dsl.obterValorCampo("elementosForm:sugestoes"));
	}
}
