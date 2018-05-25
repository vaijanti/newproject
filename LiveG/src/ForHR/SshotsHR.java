package ForHR;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SshotsHR {
	WebDriver dr;
	
	public void screenshot() throws IOException{
		
		EventFiringWebDriver edr= new EventFiringWebDriver(dr);
		File scr = edr.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\am.png");
		FileUtils.copyFile(scr, dest);
		
		
	}

}
