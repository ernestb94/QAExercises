package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pairProgramming.Calculator;

public class CalculatorTest {
	
	@Test
	
	public void testCalculator() {
	assertEquals("Not working","2 * 4 = 8, 2 * 8 = 16, 4 * 2 = 8, 8 / 2 = 4, 8 * 2 = 16, 8 / 4 = 2, 16 / 2 = 8, 16 / 8 = 2", new Calculator().calculate(2, 4, 8, 16));	
	}
}
