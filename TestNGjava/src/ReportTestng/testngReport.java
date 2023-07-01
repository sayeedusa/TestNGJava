package ReportTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngReport {
	
	@Test
	public void reportTest1() {
		System.out.println("This is Report Test 1");
	}
	@Test
	public void reportTest2() {
		Reporter.log(" This is Test 2 From testngReport"+"\n");
		System.out.println("This is Report Test 2");
	}
	@Test
	public void reportTest3() {
		System.out.println("This is Report Test 3");
		Assert.assertTrue(false);
	}

}
