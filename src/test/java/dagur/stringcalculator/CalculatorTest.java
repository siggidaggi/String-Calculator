package dagur.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("dagur.stringcalculator.CalculatorTest");
    }


    @Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(7, Calculator.add("7"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(15, Calculator.add("5,10"));
	}

	@Test
	public void testMultipleNumbers() {
		assertEquals(100, Calculator.add("50,25,20,5"));
	}

	@Test
    public void testNewlineBetweenNumbers() {
    	assertEquals(6, Calculator.add("1\n2,3"));
   	}

  /* 	@Test
   	public void testNegativeNumber() {
   		assertEquals("Negatives not allowed: -" + 1, Calculator.add("-1,5"));
   	}*/
}