package testNG;

import org.testng.annotations.Test;

public class CalculatorTest {

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDivideByZeroThrowsException() {
	  Calculator calculator = new Calculator();
	  calculator.divide(10, 0);
  }
}
