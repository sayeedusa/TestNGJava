package UI;

import org.testng.annotations.Test;

public class Test1 {

	@Test(priority = 1, description = "This is Login Test")
  public void LoginTest() {
	  System.out.println("Login sucessful");

  }

	@Test(priority = 2)
	  public void LoginTest1() {
		  System.out.println("Login sucessful");

	  }

	@Test(priority = 3, enabled = false)
	  public void LoginTest2() {
		  System.out.println("Login sucessful");

	  }



}
