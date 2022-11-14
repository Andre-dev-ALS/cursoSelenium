package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
	// radio button e check button
	
	public void clicarRadio(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public boolean isRadioMarcado(String id) {
		return driver.findElement(By.id(id)).isSelected();
	}
	
	
	public void clickarCheckBox(String id) {
driver.findElement(By.id(id)).click();		
	}
	
	public boolean isCheckMarcado(String id) {
		return driver.findElement(By.id(id)).isSelected();
	}
	
	//caixa de seleção
	
	public void selecionar(String id, String valor) {
		WebElement elemento = driver.findElement(By.id(id));
				Select selecao = new Select(elemento);
		selecao.selectByVisibleText(valor);
	}
	
	public void deselecionar(String id, String valor) {
		WebElement elemento = driver.findElement(By.id(id));
		Select deselecao = new Select(elemento);
		deselecao.deselectByVisibleText(valor);;
	}
	
	public String obterValorSelecao(String id) {
		WebElement elemento = driver.findElement(By.id(id));
		Select selecaoValor = new Select(elemento);
		return selecaoValor.getFirstSelectedOption().getText();
	}
	public List<String> obterValoresCombo(String id) {
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for(WebElement opcao: allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}
	
	public int obterQuantidadeOpcoesCombo(String id){
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}
	
	public boolean verificarOpcaoCombo(String id, String opcao){
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for(WebElement option: options) {
			if(option.getText().equals(opcao)){
				return true;
			}
		}
		return false;
	}
	
	
	// clicando em um botão
	
	public void clicarBotãoV2(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public String obterValorElemento(String id) {
		return driver.findElement(By.id(id)).getAttribute("value");
	}
	
	
	// interagindo com links
	
	public void clicarLink(String link) {
		driver.findElement(By.linkText(link));
	}
	
	//obter texto
	
	public String obterTexto(By by) {
return driver.findElement(by).getText();	
}
	
	public String obterTexto(String id) {

return obterTexto(By.id(id));
		}
	
	//alertas
	public String alertaObterTexto(){
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public String alertaObterTextoEAceita(){
		Alert alert = driver.switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;
		
	}
	
	public String alertaObterTextoENega(){
		Alert alert = driver.switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;
		
	}
	
	public void alertaEscrever(String valor) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(valor);
		alert.accept();
	}
	
	
	
}