package br.com.andre_dev_ALS.cursoSelenium.basicoElementos;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraExecucao {

	@Test
	public void testeGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		Assert.assertEquals("Google", driver.getTitle());
	}
}
