package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest {

	@Test(dataProvider = "externalData", dataProviderClass = dataProviderClass.class)
	  public void ExternaldataTest(String str, String n) {
		  System.out.println(str+"  "+n);
	  }

	@Test(dataProvider = "dataSet")
  public void dataTest(String str, String n) {
	  System.out.println(str+"  "+n);
  }


  @Test(dataProvider = "dataSet1")
  public void dataTest1(String str, String n, String str1) {
	  System.out.println(str+"  "+n+"  "+str1);
  }




  @DataProvider
  public Object[][] dataSet() {
    return new Object[][] {
     { "scott", "111" },
       { "Miller", "222" },
       { "Cairo", "333" },
       { "Johj", "444" }
    };
  }

  @DataProvider
  public Object[][] dataSet1() {
    return new Object[][] {
       { "scott", "111","NY" },
      { "Miller", "222","Boston" },
       { "Cairo", "333","California" },
       { "Johj", "444","Florida" }
    };
  }

}
