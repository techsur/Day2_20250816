package com.day2.operatorsandassignments._4equalityoperators;

import java.util.Scanner;
//69. Program to check equality of two integers.
public class Q69IntegerEquality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two integers
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();

		// Check equality using relational operator
		if (num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		} else {
			System.out.println(num1 + " is not equal to " + num2);
		}
	}
}
