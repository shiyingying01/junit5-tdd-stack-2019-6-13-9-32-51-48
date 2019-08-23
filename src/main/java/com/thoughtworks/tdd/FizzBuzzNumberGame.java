package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {

	public static String fizzBuzz(int number) {
		String result = "";
		if (number % 3 == 0) {
			result += "Fizz";
		}
		if (number % 5 == 0) {
			result += "Buzz";
		}
		if (number % 7 == 0) {
			result += "Whizz";
		}
		if (result.length() == 0)
			result = String.valueOf(number);

		return result;
	}
}
