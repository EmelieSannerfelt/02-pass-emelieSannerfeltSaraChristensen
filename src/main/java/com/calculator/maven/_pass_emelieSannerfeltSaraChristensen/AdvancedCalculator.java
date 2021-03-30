package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

public class AdvancedCalculator extends BasicCalculator implements AdvancedCalculatorInterface {

	@Override
	public double square(double number) {
		return number * number;
	}

	@Override
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	@Override
	public double absoluteValue(double number) {
		return Math.abs(number);
	}

	@Override
	public double cube(double number) {
		return number * number * number;
	}

	@Override
	public double squareRoot(double number) {
		return Math.sqrt(number);
	}

}
