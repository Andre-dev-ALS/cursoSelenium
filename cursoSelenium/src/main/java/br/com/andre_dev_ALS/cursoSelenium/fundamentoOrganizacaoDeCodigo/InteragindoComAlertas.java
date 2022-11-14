package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComAlertas {

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
	public void interagindoComAlert() {
dsl.clicarBotãoV2("alert");
String texto = dsl.alertaObterTextoEAceita();
Assert.assertEquals("Alert Simples", texto);

	dsl.escrever("elementosForm:nome", texto);}

	@Test
	public void interagindoComConfirm() {
		dsl.clicarBotãoV2("confirm");
		Assert.assertEquals("Confirm Simples", dsl.alertaObterTextoEAceita());
	
}
	
	public void prompt(){
		dsl.clicarBotãoV2("prompt");
		Assert.assertEquals("Digite um numero", dsl.alertaObterTexto());
		dsl.alertaEscrever("12");
		Assert.assertEquals("Era 12?", dsl.alertaObterTextoEAceita());
		Assert.assertEquals(":D", dsl.alertaObterTextoEAceita());
	}
}

