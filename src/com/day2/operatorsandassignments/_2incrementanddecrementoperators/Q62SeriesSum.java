package com.day2.operatorsandassignments._2incrementanddecrementoperators;

import java.util.Scanner;
//62. Program to calculate a series: 1 + 2 + 3 + … + N using increment operators.
public class Q62SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input N
		System.out.print("Enter the value of N: ");
		int N = sc.nextInt();

		int sum = 0;
		int i = 1;

		// Calculate sum using increment operator
		while (i <= N) {
			sum += i; // Add i to sum
			i++; // Increment i by 1
		}

		// Print result
		System.out.println("Sum of series 1 + 2 + ... + " + N + " = " + sum);
	}
}
