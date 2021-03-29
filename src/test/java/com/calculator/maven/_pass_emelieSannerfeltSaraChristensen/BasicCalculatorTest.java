package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator basicCalculator = new BasicCalculator();

	@Test
	public void test() {
		assertEquals(basicCalculator.addition(4, 2),6,0);
		assertEquals(basicCalculator.subtraction(4, 2),2,0);
		assertEquals(basicCalculator.multiplication(4, 2),8,0);
		assertEquals(basicCalculator.division(4, 2),2,0);
	}

}
