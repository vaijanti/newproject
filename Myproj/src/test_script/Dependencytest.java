package test_script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dependencytest {
	static WebDriver dr;
	
	@Test
	public void method1()
	
	{
	
		System.out.println("hi");
	}
	
	@Test (dependsOnMethods={"method1"})
	
	public void method2()
	
	{
	System.out.println("helloranu");	
	}
	
	@Test
	public void method3() throws IOException{
		
		 dr= new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		
		dr.findElement(By.name("firstname")).sendKeys("rn");
		dr.findElement(By.name("lastname")).sendKeys("fuc");
		dr.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		dr.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
		dr.findElement(By.name("reg_passwd__")).sendKeys("abc");
		
		
		WebElement el= dr.findElement(By.name("birthday_day"));
	
	Select sel= new Select(el);
	sel.selectByValue("15");
	
	
	WebElement	el1 = dr.findElement(By.name("birthday_month"));
	sel.selectByValue("10");
	WebElement	el2 = dr.findElement(By.id("year"));
		sel.selectByIndex(2);
		
		
		
		boolean sex;
		if(sex="female" != null){
			dr.findElement(By.xpath("//input[@value='1']")).click();
			
		}
		else
			dr.findElement(By.xpath("//input[@value='2']")).click();
		
	
	
	EventFiringWebDriver edr = new EventFiringWebDriver(dr);
	File src= edr.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Ranu\\Downloads\\ap.png");
	FileUtils.copyFile(src, dest);
	
	
	
	
}
	
	
}
