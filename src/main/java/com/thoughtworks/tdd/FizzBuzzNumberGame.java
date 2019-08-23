package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {

	public String fizzBuzz(int number) {
		if ((number%3 == 0) && (number%5 == 0)) {
			return "fizzbuzz";
		} else if ((number%3 == 0) && (number%7 == 0)) {
			return "fizzwhizz";
		} else if ((number%5 == 0) && (number%7 == 0)) {
			return "buzzwhizz";
		} else if (number%5 == 0) {
			return "buzz";
		} else if (number%7 == 0) {
			return "whizz";
		} else if (number%3 == 0) {
			return "fizz";
		}
		return String.valueOf(number);
	}

}
