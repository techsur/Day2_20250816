package com.day2.operatorsandassignments._10conditionalternaryoperator;
//94 Program to find the largest of two numbers using ternary operator.
public class Q94LargestOfTwo {
	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 42;

		// Using ternary operator to find the largest
		int largest = (num1 > num2) ? num1 : num2;

		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);
		System.out.println("Largest Number: " + largest);
	}
}
