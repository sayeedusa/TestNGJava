package Utilities;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class testUtils {


	public void getScreenshot() {

		Date currentDate=new Date();
		String screenshotfilename=currentDate.toString().replace(" ","-").replace(" ", " ");
		//File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Fileutils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotFile+".png"));


	}

}
