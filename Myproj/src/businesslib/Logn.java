package businesslib;

import java.util.concurrent.TimeUnit;





import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logn {
public WebDriver dr;
	
	Logger log =Logger.getLogger("Logn");
	
	@BeforeMethod
	public void setup(){
  // System.setProperty("WebDriver.chrome.driver","C:\\Users\\Ranu\\Downloads\\ChromeSetup");
   dr= new FirefoxDriver();		
   dr.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
   dr.manage().deleteAllCookies();
   dr.manage().window().maximize();
   dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
   dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
   
   @Test(priority=0)
   public void logintest() throws InterruptedException
   {
	   dr.findElement(By.name("txtUsername")).sendKeys("Admin");
	   dr.findElement(By.name("txtPassword")).sendKeys("admin");
	   Thread.sleep(3000);
	   dr.findElement(By.name("Submit")).click();
	   
	   Thread.sleep(6000);
	   
	  
   }
   
   @Test(priority=1)
   public void adminpagetest() throws InterruptedException{
	   dr.findElement(By.name("txtUsername")).sendKeys("Admin");
	   dr.findElement(By.name("txtPassword")).sendKeys("admin");
	   Thread.sleep(3000);
	   dr.findElement(By.name("Submit")).click();
	   dr.findElement(By.xpath("//a[@href='/index.php/admin/viewAdminModule']")).click();
	   dr.findElement(By.id("menu_admin_UserManagement")).click();
	   dr.findElement(By.xpath("/index.php/admin/viewSystemUsers")).click();
	   log.info("viewuser");
   }
  
   @AfterMethod
   public void Teardown() throws InterruptedException
   {
	   dr.close();   
   }
}
