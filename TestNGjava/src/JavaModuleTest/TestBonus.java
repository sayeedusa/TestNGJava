package JavaModuleTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestBonus {
	SalaryCaculate cal=new SalaryCaculate();
  @Test
  public void checkBonus() {

	  System.out.println(cal.bonuscalcul(450));
	   assertEquals(450, 450);


  }
  @Test
  public void checkBonusFail() {

	  System.out.println(cal.bonuscalcul(450));
	   assertEquals(450, 550);


  }
}
