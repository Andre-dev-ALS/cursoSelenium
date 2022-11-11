package br.com.andre_dev_ALS.cursoSelenium.fundamentoOrganizacaoDeCodigo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class InteragindoComConfirm {
@Test
public void interagirComConfirm() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	driver.findElement(By.id("confirm")).click();
	Alert confirm = driver.switchTo().alert();
	String texto = confirm.getText();
	System.out.println(texto);
Assert.assertEquals("Confirm Simples", confirm.getText());
confirm.accept();
Assert.assertEquals("Confirmado", confirm.getText());
confirm.accept();


driver.findElement(By.id("confirm")).click();
confirm = driver.switchTo().alert();
Assert.assertEquals("Confirm Simples", confirm.getText());
confirm.dismiss();
Assert.assertEquals("Negado", confirm.getText());
confirm.dismiss();

driver.quit();
}
}
