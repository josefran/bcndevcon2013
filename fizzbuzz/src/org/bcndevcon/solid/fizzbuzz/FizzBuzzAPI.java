package org.bcndevcon.solid.fizzbuzz;


public class FizzBuzzAPI {

	private FizzBuzzComposite fizzBuzz = new FizzBuzzComposite();

	public FizzBuzzAPI() {
		fizzBuzz.add(new Fizz());
		fizzBuzz.add(new Buzz());
	}
	
	public String calculate(int number) {
		String result = fizzBuzz.calculate(number);
		return result.isEmpty()? Integer.toString(number) : result;
	}

}
