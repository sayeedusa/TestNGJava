package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest1 {


	@Test(dataProvider = "datasetCreat")
  public void dataTest(String str, String n) {
	  System.out.println(str+"  "+n);
  }


  @Test(dataProvider = "datasetCreat")
  public void dataTest1(String str, String n, String str1) {
	  System.out.println(str+"  "+n+"  "+str1);
  }




  @DataProvider(name="datasetCreat")
  public Object[][] dataSet(Method m) {
	  Object[][] testdata=null;

	  if(m.getName().equals("dataTest"))
	  {

		  testdata=new Object[][]
		  {
		     { "scott", "111" },
		       { "Miller", "222" },
		      { "Cairo", "333" },
		     { "Johj", "444" }
		    };
		    }
		    else if(m.getName().equals("dataTest1"))
		    {
		    	testdata=new Object[][] {
		    		{ "scott", "111","NY" },
		    	    { "Miller", "222","Boston" },
		    	     { "Cairo", "333","California" },
		    	     { "Johj", "444","Florida" },
		    	    };
		    	}
		    return testdata;
		    }
}



