package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {
@Test
public void should_return_1_when_fizzBuzz_given_1() {
	//given
	int number = 1;
	//when
	String word = FizzBuzzNumberGame.fizzBuzz(number);
	
	//then
	Assertions.assertEquals("1", word);
}

@Test
public void should_return_Fizz_when_fizzBuzz_given_3() {
	//given
	int number = 3;
	
	//when
	String word = FizzBuzzNumberGame.fizzBuzz(number);
	
	//then
	Assertions.assertEquals("Fizz", word);
}

@Test
public void should_return_Buzz_when_fizzBuzz_given_5() {
	//given
	int number = 5;
	
	//when
	String word = FizzBuzzNumberGame.fizzBuzz(number);
	
	//then
	Assertions.assertEquals("Buzz", word);
}

@Test
public void should_return_Whizz_when_fizzBuzz_given_7() {
	//given
	int number = 7;
	
	//when
	String word = FizzBuzzNumberGame.fizzBuzz(number);
	
	//then
	Assertions.assertEquals("Whizz", word);
}

@Test
public void should_return_Whizz_when_fizzBuzz_given_15() {
	//given
	int number = 15;
	
	//when
	String word = FizzBuzzNumberGame.fizzBuzz(number);
	
	//then
	Assertions.assertEquals("FizzBuzz", word);
}

@Test
public void should_return_Whizz_when_fizzBuzz_given_35() {
	//given
	int number = 35;
	
	//when
	String word = FizzBuzzNumberGame.fizzBuzz(number);
	
	//then
	Assertions.assertEquals("BuzzWhizz", word);
}

@Test
public void should_return_Whizz_when_fizzBuzz_given_105() {
	//given
	int number = 105;
	
	//when
	String word = FizzBuzzNumberGame.fizzBuzz(number);
	
	//then
	Assertions.assertEquals("FizzBuzzWhizz", word);
}

}
