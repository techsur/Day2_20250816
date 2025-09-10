package com.day2.operatorsandassignments._3relationaloperators;

import java.util.Scanner;
//68. Program to compare two numbers and print if they are equal, greater, or smaller.
public class Q68CompareNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		// Compare numbers using relational operators
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}
}
