package testscript;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Gmail_test {
		@Test
		public void login(){
			WebDriver dr= new FirefoxDriver();
			dr.get("https://www.facebook.com/");
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			Select sl= new Select(dr.findElement(By.xpath("//select[@aria-label='Day']")));
			Select s2= new Select(dr.findElement(By.id("month")));
			Select s3= new Select(dr.findElement(By.id("year")));
			Logger lg= Logger.getLogger("devopinoyLogger");
			lg.info("u loged in");
			sl.selectByIndex(2);
			s2.selectByVisibleText("Dec");
			s3.selectByValue("1990");
			dr.close();
			
			
			
		}
	
}
