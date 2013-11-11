package org.bcndevcon.solid.fizzbuzz;

public class Fizz implements FizzBuzzComponent {

	public static final String FIZZ = "Fizz";

	@Override
	public String calculate(int number) {
		return (number % 3  == 0)? Fizz.FIZZ : "";
	}

}
