package com.day2.operatorsandassignments._3relationaloperators;

import java.util.Scanner;
//67. Program to check eligibility to vote based on age.
public class Q67VotingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input age
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		// Voting eligibility check
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}
	}
}
