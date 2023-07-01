package TestListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class Listeners implements ITestListener{

	
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName());
		Reporter.log("On Failure This Method Has Run");
	   System.out.println("On Failure This Method Has Run");
	   System.out.println("=======");


	}
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of Execution " +result.getStatus());
	  


	}
}
