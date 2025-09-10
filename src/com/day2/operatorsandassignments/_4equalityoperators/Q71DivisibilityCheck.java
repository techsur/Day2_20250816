package com.day2.operatorsandassignments._4equalityoperators;

import java.util.Scanner;
//71. Program to check if a number is divisible by another using equality operators.
public class Q71DivisibilityCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter divisor: ");
		int divisor = sc.nextInt();

		// Check divisibility using modulus and equality operator
		if (divisor != 0 && dividend % divisor == 0) {
			System.out.println(dividend + " is divisible by " + divisor);
		} else if (divisor == 0) {
			System.out.println("Division by zero is not allowed!");
		} else {
			System.out.println(dividend + " is NOT divisible by " + divisor);
		}
	}
}
