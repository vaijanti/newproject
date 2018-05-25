package genlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gmail_login {

	

	@Test
	
	public static void log() throws InterruptedException{
		

		WebDriver dr= new FirefoxDriver();
		dr.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		dr.findElement(By.id("identifierId")).sendKeys("vaijanti.nety90@gmail.com");
		dr.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mypapama");
		dr.findElement(By.xpath("//span[text()='Next']")).click();
	}
}