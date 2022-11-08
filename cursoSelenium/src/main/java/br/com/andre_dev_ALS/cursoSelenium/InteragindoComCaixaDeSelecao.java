package br.com.andre_dev_ALS.cursoSelenium;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteragindoComCaixaDeSelecao {

	@Test
	public void interagindoComCaixaDeselecaoSimples() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		// FindElement retorna uma estância do tipo WebElement
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		// Uma estância da classe Select que recebe o elemento obtido pela estância a
		// cima
		Select selecao = new Select(elemento);

		// selecionando um elemento por index
//		selecao.selectByIndex(2);
		// selecionando um elemento pelo seu valor
//		selecao.selectByValue("superior");
		// selecionando um elemento que esteja visível na caixa de seleção
		selecao.selectByVisibleText("2o grau completo");

		Assert.assertEquals("2o grau completo", selecao.getFirstSelectedOption().getText());
		driver.quit();
	}

	@Test
	public void deveVerificarValoresSelecaoSimples() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		Select selecao = new Select(elemento);

		// getOption retorna uma lista de elementos do tipo WebElement
		List<WebElement> options = selecao.getOptions();
		Assert.assertEquals(8, options.size());

		boolean encontrou = false;
		for (WebElement option : options) {
			if (option.getText().equals("Mestrado")) {
				encontrou = true;
				break;
			}
		}
		Assert.assertTrue(encontrou);

		driver.quit();
	
}

	
	public void interagirComSelecaoMultipla(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		Select selecao = new Select(elemento);
//		combo.selectByIndex(2);
//		combo.selectByValue("superior");
		selecao.selectByVisibleText("2o grau completo");
		
		Assert.assertEquals("2o grau completo", selecao.getFirstSelectedOption().getText());
		driver.quit();
	}
	
	
	
	@Test
	public void deveVerificarValoresSelecaoMultiplo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
		Select selecao = new Select(elemento);
		selecao.selectByVisibleText("Natacao");
		selecao.selectByVisibleText("Corrida");
		selecao.selectByVisibleText("O que eh esporte?");

		List<WebElement> allSelectedOptions = selecao.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectedOptions.size());

		selecao.deselectByVisibleText("Corrida");
		allSelectedOptions = selecao.getAllSelectedOptions();
		Assert.assertEquals(2, allSelectedOptions.size());
		driver.quit();
	}

}
