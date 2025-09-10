package com.day2.operatorsandassignments._10conditionalternaryoperator;

import java.util.Scanner;

public class Q97GradeAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking marks input
		System.out.print("Enter student's marks: ");
		int marks = sc.nextInt();

		// Using nested ternary operator
		String grade = (marks >= 75) ? "A" : (marks >= 50) ? "B" : "C";

		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);

		sc.close();
	}
}
