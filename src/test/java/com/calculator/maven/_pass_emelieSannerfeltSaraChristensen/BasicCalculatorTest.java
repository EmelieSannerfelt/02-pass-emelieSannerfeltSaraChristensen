package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator basicCalculator = new BasicCalculator();

	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	// Addition

	@Test
	public void testAdditionPositive() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.addition(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testAdditionNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempRandomValue2 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.addition(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testAdditionZero() {
		assertEquals(basicCalculator.addition(0, 4), 4, 0);
		assertEquals(basicCalculator.addition(4, 0), 4, 0);
		assertEquals(basicCalculator.addition(0, 0), 0, 0);
	}

	// Subtraction

	@Test
	public void testSubtractionPositive() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1 - tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.subtraction(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testSubtractionNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempRandomValue2 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 - tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.subtraction(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testSubtractionZero() {
		assertEquals(basicCalculator.subtraction(5, 0), 5, 0);
		assertEquals(basicCalculator.subtraction(0, 5), -5, 0);
		assertEquals(basicCalculator.subtraction(0, 0), 0, 0);
	}

	// Multiplication

	@Test
	public void testMultiplicationPositive() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1 * tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.multiplication(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testMultiplicationNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempRandomValue2 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 * tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.multiplication(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testMultiplicationZero() {
		assertEquals(basicCalculator.multiplication(0, 3), 0, 0);
		assertEquals(basicCalculator.multiplication(3, 0), 0, 0);
		assertEquals(basicCalculator.multiplication(0, 0), 0, 0);
	}

	// Division

	@Test
	public void testDivisionPositive() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1 / tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.division(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testDivisionNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempRandomValue2 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 / tempRandomValue2;
			LOG.info("Testing the method add with: " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(basicCalculator.division(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testDivisionZero() {
		assertEquals(basicCalculator.division(0, 2), 0, 0);
	}
}
