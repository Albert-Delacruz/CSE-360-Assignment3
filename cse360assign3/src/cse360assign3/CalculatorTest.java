package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This is a test class for the Calulator class
 * by testing its methods and constructor
 * 
 * ID: 1213265207
 * Assignment 3
 * @author Albert De La Cruz
 *
 */
class CalculatorTest {

	/**
	 * test if constructor is working 
	 */
	@Test
	void Calculatortest() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	/**
	 * test if inheritance worked
	 */
	@Test
	void InheritanceTest() {
		Calculator calc = new Calculator();
		assertTrue(calc.getTotal() == 0);
	}
	
	/**
	 * test that muliplication works
	 */
	@Test
	void multTest() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.mult(5);//should = 10
		assertTrue(calc.getTotal() == 10);
	}
	
	/**
	 * test that division works
	 */
	@Test
	void divTest() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.div(2);//should get 5
		assertTrue(calc.getTotal() == 5);
	}
	
	/**
	 * test that power is working
	 */
	@Test
	void powerTest() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.power(3);//should get 8
		assertTrue(calc.getTotal() == 8);
	}
	
	/**
	 * test dividing by zero
	 */
	void divideByZeroTest() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.div(0);//should get zero
		assertTrue(calc.getTotal() == 0);
	}
	
	/**
	 * test negative power
	 */
	void negativePowerTest() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.power(-1);
		assertTrue(calc.getTotal() == 0);
	}
	
	/**
	 * testing the toString
	 */
	void toStringTest() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.mult(3);
		calc.div(3);
		calc.power(2);
		calc.div(0);
		calc.power(0);
		String output = calc.toString();
		assertTrue(output.contentEquals("0 + 5 * 3 / 3 ^ 2 / 0 ^ 0") );
		
		
	}

}
