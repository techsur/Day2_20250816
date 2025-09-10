package com.day2.operatorsandassignments._10conditionalternaryoperator;

//95. Program to check if a number is even or odd using ternary operator.
public class Q95EvenOddTernary {

	public static void main(String[] args) {
		int num = 17;

		// Using ternary operator to check even or odd
		String result = (num % 2 == 0) ? "Even" : "Odd";

		System.out.println("Number: " + num);
		System.out.println("The number is " + result);
	}
}
