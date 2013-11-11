package org.bcndevcon.solid.fizzbuzz;

import static org.junit.Assert.*;

import org.bcndevcon.solid.fizzbuzz.FizzBuzzAPI;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestFizzBuzz {

	private FizzBuzzAPI fizzBuzz;

	@Before
	public  void setUp() {
		fizzBuzz = new FizzBuzzAPI();
	}
	
	@Test
	public void number1Return1() {
		int number = 1;
		String result = fizzBuzz.calculate(number);
		assertEquals("1", result);
	}

	@Test
	public void number2Return2() {
		int number = 2;
		String result = fizzBuzz.calculate(number);
		assertEquals("2", result);
	}

	@Test
	public void number6IsDivisibleBy3ReturnFizz() {
		int number = 6;
		String result = fizzBuzz.calculate(number);
		assertEquals(Fizz.FIZZ, result);
	}

	@Test
	public void number10IsDivisibleBy5ReturnFizz() {
		int number = 10;
		String result = fizzBuzz.calculate(number);
		assertEquals(Buzz.BUZZ, result);
	}

	@Test
	public void number30IsDivisibleBy3AndIsDivisibleBy5ReturnFizzBuzz() {
		int number = 30;
		String result = fizzBuzz.calculate(number);
		assertEquals(Fizz.FIZZ + Buzz.BUZZ, result);
	}

}
