package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {

	public String fizzBuzz(int number) {
		if (number%3 == 0) {
			return "fizz";
		}
		return String.valueOf(number);
	}

}
