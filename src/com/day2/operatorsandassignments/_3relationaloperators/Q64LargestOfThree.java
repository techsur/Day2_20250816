package com.day2.operatorsandassignments._3relationaloperators;

import java.util.Scanner;

public class Q64LargestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input three numbers
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();

		int largest;

		// Compare numbers using relational operators
		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			largest = num2;
		} else {
			largest = num3;
		}

		// Print result
		System.out.println("Largest number is: " + largest);
	}
}
