package TestListener;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class retryDemo extends BaseTest{
	
	@Test(retryAnalyzer = Retry.class)
	public void retryTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.get("http://www.ebay.com");  //We can write it here or in the BaseTest Class
		org.testng.Assert.assertTrue(false);
		
	}

}
