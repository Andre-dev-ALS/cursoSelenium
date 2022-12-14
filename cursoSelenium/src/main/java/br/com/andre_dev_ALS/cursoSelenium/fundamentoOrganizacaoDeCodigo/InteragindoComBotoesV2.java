package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComBotoesV2 {

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
	public void InteragindoComBotao() {
dsl.clicarBotãoV2("buttonSimple");
Assert.assertEquals("Obrigado!", dsl.obterValorElemento("buttonSimple"));

	}
}
