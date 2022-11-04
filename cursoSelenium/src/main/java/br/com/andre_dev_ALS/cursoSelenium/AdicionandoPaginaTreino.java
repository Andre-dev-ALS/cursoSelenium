package br.com.andre_dev_ALS.cursoSelenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdicionandoPaginaTreino {
	@Test
	public void paginaTreino() {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
//comando para encontrar os arquivos de treino em qualquer computador, se os arquivos forem ccolocados na pasta indicada
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		// comando para fechar o navegador
		driver.quit();
	}
}
