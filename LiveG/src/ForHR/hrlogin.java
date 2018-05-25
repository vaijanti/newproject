package ForHR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class hrlogin {
	static WebDriver dr;
	
	By username = By.name("txtUsername");
	By password= By.name("txtPassword");
	By lgbtn = By.name("Submit"); 
	
	public hrlogin(WebDriver dr){
		this.dr=dr;
	}

	public void Logintohr(String usn,String pass){
		
		dr.findElement(username).sendKeys(usn);

		dr.findElement(password).sendKeys(pass);
	
		dr.findElement(lgbtn).click();
		}
	
	}	

	

