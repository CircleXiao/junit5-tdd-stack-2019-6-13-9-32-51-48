package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {

	@Test
	public void should_return_1_when_fizzBuzz_given_1() {
		// given
		int number = 1;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("1", result);
		
	}

}
