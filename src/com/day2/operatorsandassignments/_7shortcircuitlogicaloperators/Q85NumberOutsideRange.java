package com.day2.operatorsandassignments._7shortcircuitlogicaloperators;

import java.util.Scanner;
//85. Program to check if a number lies outside a given range using ||.
public class Q85NumberOutsideRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number and range
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("Enter lower bound of range: ");
		int lower = sc.nextInt();
		System.out.print("Enter upper bound of range: ");
		int upper = sc.nextInt();

		// Check if number is outside the range
		if (num < lower || num > upper) {
			System.out.println(num + " lies outside the range " + lower + " to " + upper);
		} else {
			System.out.println(num + " lies within the range " + lower + " to " + upper);
		}
	}
}
