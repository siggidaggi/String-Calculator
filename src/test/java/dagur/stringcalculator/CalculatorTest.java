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

  	@Test
   	public void testNegativeNumber() {
   		try{
   			Calculator.add("5,5,-5,-1");
   		} catch (IllegalArgumentException ex) {
   		assertEquals("Negatives not allowed: -5, -1", ex.getMessage());
   		}
   	}

   	@Test
   	public void testNumbersOver1k() {
   		assertEquals(1111, Calculator.add("11,100,1500,1000"));
   	}

   	@Test
   	public void testDifferentDelimeter() {
   		assertEquals(3, Calculator.add("//;\n1;2"));
   	}
}