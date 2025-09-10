package com.day2.operatorsandassignments._7shortcircuitlogicaloperators;

import java.util.Scanner;
//86. Program to demonstrate difference between & and &&.
public class Q86AndOperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("\nDemonstrating & (both conditions are always evaluated):");
		if ((num1 != 0) & (num2 / num1 > 1)) { // & evaluates both sides
			System.out.println("Condition is true using &");
		} else {
			System.out.println("Condition is false using &");
		}

		System.out.println("\nDemonstrating && (short-circuit, second condition evaluated only if first is true):");
		if ((num1 != 0) && (num2 / num1 > 1)) { // && short-circuits
			System.out.println("Condition is true using &&");
		} else {
			System.out.println("Condition is false using &&");
		}
	}
}
