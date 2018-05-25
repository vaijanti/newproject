package testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alertswin {
	
	@Test
	public void alert() throws InterruptedException{
		String actual= "Please select start place.";
		WebDriver dr= new FirefoxDriver();
		dr.get("https://www.ksrtc.in/oprs-web/");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.findElement(By.xpath(".//*[@id='searchBtn']")).click();
	Alert alt= dr.switchTo().alert();
	
	String msg= alt.getText();
	System.out.println(msg);
	Assert.assertEquals(actual, msg);
	Thread.sleep(2000);
	alt.accept();
		
	}

}
