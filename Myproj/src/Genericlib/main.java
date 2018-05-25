package Genericlib;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.log4testng.Logger;

public class main {

	public static void main(String[] args) {
		
		WebDriver dr= new FirefoxDriver();
		dr.get("https://www.airasia.com/en/home.page?cid=1");
		dr.findElement(By.id("cb_tab_Car")).click();
		boolean el =dr.findElement(By.id("cb_tab_Car")).isSelected();
		
		System.out.println(el);
		 Assert.assertEquals( 12,13 );


	}

}
