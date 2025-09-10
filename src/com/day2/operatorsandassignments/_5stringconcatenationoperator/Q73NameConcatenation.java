package com.day2.operatorsandassignments._5stringconcatenationoperator;

import java.util.Scanner;
//73. Program to concatenate first name and last name of a user.
public class Q73NameConcatenation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input first name
		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();

		// Input last name
		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();

		// Concatenate first and last name
		String fullName = firstName + " " + lastName;

		// Print result
		System.out.println("Full name: " + fullName);
	}
}
