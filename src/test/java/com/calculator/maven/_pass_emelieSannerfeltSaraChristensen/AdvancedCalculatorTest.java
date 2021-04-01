package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

import java.util.Random;
import java.util.logging.Logger;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator advancedCalculator = new AdvancedCalculator();

	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	// Cube
	@Test
	public void testCubePositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1 * tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.cube(tempRandomValue1), tempResult, 0);
		}
	}

	@Test
	public void testCubeNegative() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 * tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.cube(tempRandomValue1), tempResult, 0);
		}
	}

	// Square
	@Test
	public void testSquarePositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.square(tempRandomValue1), tempResult, 0);
		}
	}

	@Test
	public void testSquareNegative() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.square(tempRandomValue1), tempResult, 0);
		}
	}

	// squareroot
	@Test
	public void testSquareRootPositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = Math.sqrt(tempRandomValue1);
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.squareRoot(tempRandomValue1), tempResult, 0);
		}
	}

	// absolutevalue

	@Test
	public void testAbsoluteValuePositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.absoluteValue(tempRandomValue1), tempResult, 0);
		}
	}

	// raisetothepowerof

	@Test
	public void testraisedToThePowerOfPositive() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextInt();
			tempRandomValue2 = random.nextInt();
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.raisedToThePowerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
}
