package com.day2.operatorsandassignments._3relationaloperators;

import java.util.Scanner;
//65. Program to check if a number lies within a given range.
public class Q65NumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number and range
		System.out.print("Enter the number to check: ");
		int num = sc.nextInt();
		System.out.print("Enter lower bound of range: ");
		int lower = sc.nextInt();
		System.out.print("Enter upper bound of range: ");
		int upper = sc.nextInt();

		// Check if number lies within range using relational operators
		if (num >= lower && num <= upper) {
			System.out.println(num + " lies within the range " + lower + " to " + upper);
		} else {
			System.out.println(num + " does not lie within the range " + lower + " to " + upper);
		}
	}
}
