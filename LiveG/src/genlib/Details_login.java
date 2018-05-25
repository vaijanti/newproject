package genlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Details_login {

	WebDriver driver;
	@BeforeMethod
	public void set(){
	
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.demo.guru99.com/V4/index.php");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	/* @test
	public void  verifiy_log (){
	
		// Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr1336");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("dAnavUq");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
	}	*/
}
}