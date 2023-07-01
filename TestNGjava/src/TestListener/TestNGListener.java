package TestListener;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGListener {

	@Test
  public void testValue() {
		assertEquals(100, 100);
  }
	@Test
	  public void testValue1() {
			assertEquals(100, 200);
	  }
}
