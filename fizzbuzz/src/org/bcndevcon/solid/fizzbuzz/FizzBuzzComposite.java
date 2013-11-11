package org.bcndevcon.solid.fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzComposite implements FizzBuzzComponent {

	private List<FizzBuzzComponent> childrens = new LinkedList<FizzBuzzComponent>();
			
	@Override
	public String calculate(int number) {
		String result = "";
		for (FizzBuzzComponent component : childrens) {
			result += component.calculate(number);
		}
		return result;
	}

	public void add(FizzBuzzComponent component) {
		childrens.add(component);
	}
	
}
