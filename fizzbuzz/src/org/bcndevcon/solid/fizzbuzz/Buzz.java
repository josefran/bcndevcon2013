package org.bcndevcon.solid.fizzbuzz;

public class Buzz implements FizzBuzzComponent {

	public static final String BUZZ = "Buzz";

	@Override
	public String calculate(int number) {
		return (number % 5  == 0)? Buzz.BUZZ : "";
	}

}
