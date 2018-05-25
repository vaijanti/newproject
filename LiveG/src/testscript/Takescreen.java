package testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

public class Takescreen {

	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("vaijanti.nety90");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("mypapama");
		
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		/* Date d1 = new Date();
		String det= d1.toString().replace(':', '-'); */
		EventFiringWebDriver edr = new EventFiringWebDriver(driver);
		File src= edr.getScreenshotAs(OutputType.FILE);
		File dest=  new File("d:\\cp.png");
		FileUtils.copyFile(src, dest);
		
	
		
		
		
		
		

	}

}
