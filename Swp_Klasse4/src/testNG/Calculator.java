package testNG;

public class Calculator {
	
	public int divide(int numerator, int denominator) {
		if(denominator == 0) {
			throw new IllegalArgumentException("Denominator cannot be zero");
		}
		return numerator/denominator;
	}

}
