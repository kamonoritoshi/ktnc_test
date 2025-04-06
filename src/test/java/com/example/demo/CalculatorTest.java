package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CalculatorTest {

	Calculator cal = new Calculator();

	@Test
	public void testAdd() {
		Assertions.assertEquals(cal.add(2, 3), 5);
	}

	@Test
	public void testSubtract() {
		Assertions.assertEquals(cal.subtract(5, 2), 3);
	}

	@Test
	public void testMultiply() {
		Assertions.assertEquals(cal.multiply(3, 4), 12);
	}

	@Test
	public void testDivide() {
		Assertions.assertEquals(cal.divide(10, 2), 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testDivideByZero() {
		cal.divide(5, 0);
	}

}
