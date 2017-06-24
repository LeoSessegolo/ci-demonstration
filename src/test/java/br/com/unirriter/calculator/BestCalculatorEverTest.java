package br.com.unirriter.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestCalculatorEverTest {
	
	@Test
	public void testAdd1Plus1() {
		int a = 1;
		int b = 1;
		
		assertEquals(2, BestCalculatorEver.add(a, b));
	}
	
	@Test
	public void testMultiple10By14() {
		int a = 10;
		int b = 14;
		
		assertEquals(140, BestCalculatorEver.multiple(a, b));
	}
}
