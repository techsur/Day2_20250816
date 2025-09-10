package com.day2.operatorsandassignments._9typecastoperators;

import java.util.Scanner;

//90. Program to convert double to int and vice versa.
public class Q90DoubleIntConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input a double number
		System.out.print("Enter a double number: ");
		double d = sc.nextDouble();

		// Convert double to int (type casting)
		int intFromDouble = (int) d;
		System.out.println("Double " + d + " converted to int: " + intFromDouble);

		// Input an integer number
		System.out.print("Enter an integer number: ");
		int i = sc.nextInt();

		// Convert int to double
		double doubleFromInt = (double) i;
		System.out.println("Integer " + i + " converted to double: " + doubleFromInt);
	}
}
