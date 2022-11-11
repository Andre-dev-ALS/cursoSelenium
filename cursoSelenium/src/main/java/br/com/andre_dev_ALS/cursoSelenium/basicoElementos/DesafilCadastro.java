package br.com.andre_dev_ALS.cursoSelenium.basicoElementos;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesafilCadastro {
@Test
public void cadastrandoUsuario() {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
driver.findElement(By.id("elementosForm:nome")).sendKeys("André");
Assert.assertEquals("André", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));

driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Silva");
Assert.assertEquals("Silva", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));

driver.findElement(By.id("elementosForm:sexo:0")).click();
Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());

driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());


WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
Select selecao = new Select(elemento);
selecao.selectByVisibleText("Superior");
Assert.assertEquals("Superior", selecao.getFirstSelectedOption().getText());

driver.findElement(By.id("elementosForm:cadastrar")).click()	;
Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
driver.quit();

}
}
