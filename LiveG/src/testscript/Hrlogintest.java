package testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;





import ForHR.hrlogin;
 


public class Hrlogintest {
	
	@Test
	public void testlg() throws IOException, InterruptedException{
	WebDriver dr= new FirefoxDriver();
	dr.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	dr.manage().window().maximize();
	hrlogin log= new hrlogin(dr);
	log.Logintohr("Admin", "admin");
	dr.findElement(By.xpath("(//a[@class='firstLevelMenu'])[]")).click();
	dr.findElement(By.xpath("//a[@href='/index.php/performance/viewEmployeePerformanceTrackerList']")).click();
	}
	
   @AfterMethod
   public void failtst(ITestResult result)
{
	if(ITestResult.FAILURE== result.getStatus())
	{
		
	}
	   
}
	
	
	

	
		
	
	
			
	}
		
		
	
	



