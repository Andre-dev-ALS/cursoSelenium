package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteragindoComCaixaDeSelecao {

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
	public void interagindoComCaixaDeselecaoSimples() {
		dsl.selecionar("elementosForm:escolaridade", "2o grau completo");
		Assert.assertEquals("2o grau completo", dsl.obterValorSelecao("elementosForm:escolaridade"));
	}

	@Test
	public void deveVerificarValoresSelecaoSimples() {
		Assert.assertEquals(8, dsl.obterQuantidadeOpcoesCombo("elementosForm:escolaridade"));
		Assert.assertTrue(dsl.verificarOpcaoCombo("elementosForm:escolaridade", "Mestrado"));

	}
@Test
	public void deveVerificarValoresComboMultiplo(){
		dsl.selecionar("elementosForm:esportes", "Natacao");
		dsl.selecionar("elementosForm:esportes", "Corrida");
		dsl.selecionar("elementosForm:esportes", "O que eh esporte?");

		List<String> opcoesMarcadas = dsl.obterValoresCombo("elementosForm:esportes");
		Assert.assertEquals(3, opcoesMarcadas.size());
		
		dsl.deselecionar("elementosForm:esportes", "Corrida");
		opcoesMarcadas = dsl.obterValoresCombo("elementosForm:esportes");
		Assert.assertEquals(2, opcoesMarcadas.size());
		opcoesMarcadas.containsAll(Arrays.asList("Natacao", "O que eh esporte?"));
	}
	

}