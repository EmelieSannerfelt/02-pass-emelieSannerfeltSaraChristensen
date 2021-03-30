package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

public class Main {

	public static void main(String[] args) {

		BasicCalculator basicCalculator = new BasicCalculator();
		System.out.println(basicCalculator.addition(4, 6));

		System.out.println(basicCalculator.subtraction(44.6, 6.5));

		System.out.println(basicCalculator.multiplication(4, 4));

		System.out.println(basicCalculator.division(10, 2));

		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		System.out.println(advancedCalculator.square(10.0));

		System.out.println(advancedCalculator.cube(10));// ett tal gånger 3

		System.out.println(advancedCalculator.squareRoot(Math.sqrt(9)));

		System.out.println(advancedCalculator.absoluteValue(Math.abs(3)));

		System.out.println(advancedCalculator.raisedToThePowerOf(1, 6));

	}

}
