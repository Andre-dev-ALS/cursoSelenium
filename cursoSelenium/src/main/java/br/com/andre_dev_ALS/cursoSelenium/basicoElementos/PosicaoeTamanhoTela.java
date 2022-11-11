package br.com.andre_dev_ALS.cursoSelenium.basicoElementos;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PosicaoeTamanhoTela {

	@Test
	public void teste() {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}

}
