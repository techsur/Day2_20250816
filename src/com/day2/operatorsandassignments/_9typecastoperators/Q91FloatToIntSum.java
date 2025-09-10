package com.day2.operatorsandassignments._9typecastoperators;

import java.util.Scanner;
//91. Program to convert float to int and calculate sum.
public class Q91FloatToIntSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input a float number
		System.out.print("Enter a float number: ");
		float f = sc.nextFloat();

		// Convert float to int (explicit type casting)
		int i = (int) f;

		// Calculate sum of float and int
		float sum = f + i;

		// Display results
		System.out.println("Original float value: " + f);
		System.out.println("Converted int value: " + i);
		System.out.println("Sum of float and int: " + sum);
	}
}
