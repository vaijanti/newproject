package test_script;

import java.io.File;
import java.io.IOException;


import java.util.Date;



import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest {
	
	boolean dr;
	@Test
	public void login() throws IOException{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	dr=driver.findElement(By.xpath("//img[@src='/webres_5786257bd7c8a5.72130757/themes/default/images/logo.png']")).isDisplayed();
	     
	    Date d1= new Date();
	    String det= d1.toString();
	    String  title= "OrangeHRM";
	    
	    Logger log=  Logger.getLogger("logintest");
	    EventFiringWebDriver edr= new EventFiringWebDriver(driver);
	    File scr= edr.getScreenshotAs(OutputType.FILE);
	    File Dest= new File("D:\\cd.png");
	    FileUtils.copyFile(scr, Dest);
	    Assert.assertEquals(title, "OrangeHRM");
	    
	    log.info(title);
	    
	    		 
	}
}


