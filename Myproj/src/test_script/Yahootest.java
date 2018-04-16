package test_script;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Yahootest {
	
	@BeforeClass
		public void lounchbr(){
		System.out.println("br lounch");
			
		}
	
	@BeforeMethod
	public void yahoologin(){
		System.out.println("yahoologin");
	
	}
	
	@Test
	public void homepage(){
		System.out.println("homepage");
		
	}
	@Test
	public void composemail(){
		System.out.println("composemail");
		
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("logout");
	}
	@AfterClass
	public void brquit(){
		System.out.println("brquit");
	}
	

}
