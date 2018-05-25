package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ForHR.hrlogin;

public class passingxml {
	
	@Test
	public void testfb() throws EncryptedDocumentException, InvalidFormatException, IOException{
		

			WebDriver dr= new FirefoxDriver();
			dr.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
			dr.manage().window().maximize();
			hrlogin log= new hrlogin(dr);
			log.Logintohr("Admin", "admin");
			dr.findElement(By.xpath("(//a[@class='firstLevelMenu'])[]")).click();
			dr.close();
	
		
			
			}		
	}

