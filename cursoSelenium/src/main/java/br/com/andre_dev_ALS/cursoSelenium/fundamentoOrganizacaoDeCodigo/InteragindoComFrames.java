package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComFrames {
	
	

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
public void interagirComFrames() {
	dsl.entrarFrame("frame1");
	dsl.clicarBotãoV2("frameButton");
	String msg = dsl.alertaObterTextoEAceita();
	Assert.assertEquals("Frame OK!", msg);
	
	dsl.sairFrame();
}
}
