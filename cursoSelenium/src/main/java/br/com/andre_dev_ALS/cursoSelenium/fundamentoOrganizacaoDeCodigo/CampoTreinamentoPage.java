package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CampoTreinamentoPage {
	private Dsl dsl;

	public CampoTreinamentoPage(WebDriver driver) {
		dsl = new Dsl(driver);
	}

	public void setNome(String nome) {
		dsl.escrever("elementosForm:nome", nome);
	}

	public void setSobrenome(String nome) {
		dsl.escrever("elementosForm:sobrenome", nome);
	}

	public void setSexoMasculino() {
		dsl.clicarRadio("elementosForm:sexo:0");
	}

	public void setSexoFeminino() {
		dsl.clicarRadio("elementosForm:sexo:1");
	}

	public void setComidaCarne() {
		dsl.clickarCheckBox("elementosForm:comidaFavorita:0");
	}

	public void setComidaFrango() {
		dsl.clickarCheckBox("elementosForm:comidaFavorita:1");
	}

	public void setComidaPizza() {
		dsl.clickarCheckBox("elementosForm:comidaFavorita:2");
	}

	public void setComidaVegetariana() {
		dsl.clickarCheckBox("elementosForm:comidaFavorita:3");
	}

	public void setEscolaridade(String valor) {
		dsl.selecionar("elementosForm:escolaridade", valor);
	}

	public void setEsporte(String... valor) {
		for (String esportes : valor) {
			dsl.selecionar("elementosForm:esportes", esportes);
		}

	}

	public void cadastrar() {
		dsl.clicarBotãoV2("elementosForm:cadastrar");
	}

	public String obterResultado() {
		return dsl.obterTexto(By.xpath("//*[@id='resultado']/span"));
	}

	public String obterNome() {
		return dsl.obterTexto(By.xpath("//*[@id='descNome']/span"));
	}

	public String obterSobrenome() {
		return dsl.obterTexto(By.xpath("//*[@id='descSobrenome']/span"));
	}

	public String obterSexo() {
		return dsl.obterTexto(By.xpath("//*[@id='descSexo']/span"));
	}

	public String obterComida() {
		return dsl.obterTexto(By.xpath("//*[@id='descComida']/span"));
	}

	public String obterEscolaridade() {
		return dsl.obterTexto(By.xpath("//*[@id='descEscolaridade']/span"));
	}

	public String obterEsportes() {
		return dsl.obterTexto(By.xpath("//*[@id='descEsportes']/span"));
	}
}
