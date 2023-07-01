package TestListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {


	public static WebDriver driver=null;
	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		 driver=new FirefoxDriver();
	//	driver.get("http://www.google.com");


	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}


}
