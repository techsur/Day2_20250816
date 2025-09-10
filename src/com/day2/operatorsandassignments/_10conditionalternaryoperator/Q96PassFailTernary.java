package com.day2.operatorsandassignments._10conditionalternaryoperator;

import java.util.Scanner;

//96. Program to check whether a student passed or failed using ternary operator.
public class Q96PassFailTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking marks input
		System.out.print("Enter student's marks: ");
		int marks = sc.nextInt();

		// Using ternary operator
		String result = (marks >= 40) ? "Pass" : "Fail";

		System.out.println("Marks: " + marks);
		System.out.println("Result: " + result);

		sc.close();
	}
}
