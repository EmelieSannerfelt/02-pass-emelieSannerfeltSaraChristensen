package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator advancedCalculator = new AdvancedCalculator();

	@Test
	public void test() {
		assertEquals(advancedCalculator.cube(4),64,0);
		assertEquals(advancedCalculator.square(10),100,0);
		assertEquals(advancedCalculator.squareRoot(9),1,73);
		assertEquals(advancedCalculator.absoluteValue(-3),3,0);
		assertEquals(advancedCalculator.raisedToThePowerOf(1,6),1,0);
	}

}
