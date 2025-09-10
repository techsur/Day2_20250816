package com.day2.operatorsandassignments._7shortcircuitlogicaloperators;

import java.util.Scanner;
//84. Program to check if a person is eligible to vote and has valid ID.
public class Q84VoteEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input age
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		// Input ID status
		System.out.print("Do you have a valid ID? (true/false): ");
		boolean hasID = sc.nextBoolean();

		// Check eligibility
		if (age >= 18 && hasID) {
			System.out.println("You are eligible to vote.");
		} else if (age < 18) {
			System.out.println("You are not eligible to vote due to age.");
		} else {
			System.out.println("You are not eligible to vote due to missing valid ID.");
		}
	}
}
