package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {

	public static String fizzBuzz(int number) {
		String result = "";
		if(number%3==0) {
			result = "Fizz";
		}else if (number%5==0) {
			result = "Buzz";
		}else if(number%7==0) {
			result = "Whizz";
		}else{
		result = String.valueOf(number);
	}
return result;
}
}
