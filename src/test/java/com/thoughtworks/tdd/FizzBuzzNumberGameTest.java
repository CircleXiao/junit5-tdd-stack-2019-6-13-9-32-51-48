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
	
	@Test
	public void should_return_fizz_when_fizzBuzz_given_3() {
		// given
		int number = 3;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("fizz", result);
	}
	
	@Test
	public void should_return_buzz_when_fizzBuzz_given_5() {
		// given
		int number = 5;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("buzz", result);
	}
	
	@Test
	public void should_return_whizz_when_fizzBuzz_given_7() {
		// given
		int number = 7;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("whizz", result);
	}
	
	@Test
	public void should_return_fizzbuzz_when_fizzBuzz_given_15() {
		// given
		int number = 15;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("fizzbuzz", result);
	}
	
	@Test
	public void should_return_fizzwhizz_when_fizzBuzz_given_21() {
		// given
		int number = 21;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("fizzwhizz", result);
	}
	
	@Test
	public void should_return_buzzwhizz_when_fizzBuzz_given_35() {
		// given
		int number = 35;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("buzzwhizz", result);
	}
	
	@Test
	public void should_return_fizzbuzzwhizz_when_fizzBuzz_given_105() {
		// given
		int number = 105;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// when
		String result = fizzBuzzNumberGame.fizzBuzz(number);
		
		// then
		Assertions.assertEquals("fizzbuzzwhizz", result);
	}

}
