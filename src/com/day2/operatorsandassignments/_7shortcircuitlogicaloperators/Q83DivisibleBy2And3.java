package com.day2.operatorsandassignments._7shortcircuitlogicaloperators;

import java.util.Scanner;
//83. Program to check if a number is divisible by 2 and 3.
public class Q83DivisibleBy2And3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Check divisibility by 2 and 3
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println(num + " is divisible by both 2 and 3");
		} else {
			System.out.println(num + " is NOT divisible by both 2 and 3");
		}
	}
}
