package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dsl {
	private WebDriver driver;

	public Dsl(WebDriver driver) {
		super();
		this.driver = driver;
	}

	// TextField e TextArea

	public void escrever(By by, String texto) {
		driver.findElement(by).sendKeys(texto);
	}

	public void escrever(String idCampo, String texto) {
		escrever(By.id(idCampo), texto);
	}

	public String obterValorCampo(String idCampo) {
		return driver.findElement(By.id(idCampo)).getAttribute("value");
	}
}