package com.day2.operatorsandassignments._4equalityoperators;

import java.util.Scanner;
//72. Program to find whether a number is positive, negative, or zero using !=.
public class Q72NumberSignCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Check number using != operator
		if (num != 0) {
			if (num > 0) {
				System.out.println(num + " is positive");
			} else {
				System.out.println(num + " is negative");
			}
		} else {
			System.out.println("The number is zero");
		}
	}
}
