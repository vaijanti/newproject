package testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	private WebDriver driver;
	          
	@Test
	public void login() throws InterruptedException, IOException{
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		
		EventFiringWebDriver edr = new EventFiringWebDriver(driver);
		 File scr = edr.getScreenshotAs(OutputType.FILE);
		 File dest= new File("C:\\Users\\Ranu\\Downloads\\c1.png");
		 FileUtils.copyFile(scr, dest);
		 System.out.println(dest);
		 
		 Logger log=  Logger.getLogger("devpinoyLogger");
		 log.debug("fail");
		 
		 
		 
		 
		 
		 
		
		
	}
	
	
	}
