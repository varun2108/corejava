package com.quinnox.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calc;

	@Before
	public void setUp() throws Exception
	{
		calc=new Calculator();
	}
	@After
	public void tearDown() throws Exception
	{
		calc=null;
	}
	@Test
	public void testAdd(){
		double result=calc.add(10.5, 20.32);
				assertEquals(30.82,result,0);
	}
	@Test
	public void testSubtract(){
		double result=calc.subtract(20.32,10.32);
			assertEquals(10,result,0);
	}
	@Test
	public void testMultiply(){
		double result=calc.multiply(2, 3);
		assertEquals(6,result,0);
	}
	@Test
	public void testDivide(){
		double result=calc.divide(10, 2);
		assertEquals(5,result,0);
	}
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero(){
		calc.divide(100.4, 0);
	}
	@Test
	public void testSquare(){
		double result=calc.square(5);
		assertEquals(25,result,0);
	}
	
}