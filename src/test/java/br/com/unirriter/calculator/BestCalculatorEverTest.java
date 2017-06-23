package br.com.unirriter.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestCalculatorEverTest {
	
	@Test
	public void testAddOnePlusOne() {
		int a = 1;
		int b = 1;
		
		assertEquals(2, BestCalculatorEver.add(a, b));
	}
}
