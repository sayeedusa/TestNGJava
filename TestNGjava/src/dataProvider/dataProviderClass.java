package dataProvider;

import org.testng.annotations.DataProvider;

public class dataProviderClass {
	 @DataProvider(name="externalData")
	  public Object[][] ExternalData() {
	    return new Object[][] {
	       { "Ex-scott", "111" },
	      { "Ex-Miller", "222" },
	      { "Ex-Cairo", "33" },
	      { "EX-Johj", "444" }
	    };
	  }

  }

