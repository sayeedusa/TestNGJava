package ScreenShot;
import java.io.File;
import java.nio.file.Files;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotDemo {

	public static void main(String[] args) {

		Date currentDate=new Date();
		String str;
		System.out.println(currentDate);
		String screenshotfilename=currentDate.toString().replace(" ","-").replace(" ", " ");
		System.out.println(screenshotfilename);
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Files.createFile(screenshotFile, new File(".//screenshot//"+screenshotFile+".png"));


	}

}
