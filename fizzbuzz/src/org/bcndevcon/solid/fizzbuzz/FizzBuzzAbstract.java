package org.bcndevcon.solid.fizzbuzz;

public abstract class FizzBuzzAbstract implements FizzBuzzComponent {

	private int divisible;
	private String text;
	
	public FizzBuzzAbstract(String text, int divisible) {
		this.divisible = divisible;
		this.text = text;
	}

	public String calculate(int number) {
		return (number % divisible  == 0)? text : "";
	}

}