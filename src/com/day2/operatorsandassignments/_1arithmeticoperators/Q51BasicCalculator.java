package com.day2.operatorsandassignments._1arithmeticoperators;

import java.util.Scanner;

//51. Write a program to add, subtract, multiply, divide, and find remainder of two numbers.
public class Q51BasicCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();

		// Perform calculations
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num2 != 0 ? num1 / num2 : 0;
		double remainder = num2 != 0 ? num1 % num2 : 0;

		// Print results
		System.out.println("Addition: " + sum);
		System.out.println("Subtraction: " + difference);
		System.out.println("Multiplication: " + product);
		if (num2 != 0) {
			System.out.println("Division: " + quotient);
			System.out.println("Remainder: " + remainder);
		} else {
			System.out.println("Division and remainder not possible (division by zero)");
		}
	}
}
