package com.day2.operatorsandassignments._3relationaloperators;

import java.util.Scanner;
//66. Program to determine if a student has passed or failed based on marks.
public class Q66PassFailChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input marks
		System.out.print("Enter marks obtained (0-100): ");
		int marks = sc.nextInt();

		// Define passing criteria
		int passingMarks = 40;

		// Check pass or fail using relational operators
		if (marks >= passingMarks) {
			System.out.println("Congratulations! You have passed.");
		} else {
			System.out.println("Sorry! You have failed.");
		}
	}
}
