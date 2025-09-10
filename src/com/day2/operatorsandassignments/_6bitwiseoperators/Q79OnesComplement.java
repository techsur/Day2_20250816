package com.day2.operatorsandassignments._6bitwiseoperators;

import java.util.Scanner;
//79. Program to find one’s complement of a number.
public class Q79OnesComplement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Calculate one's complement using bitwise NOT operator (~)
		int onesComplement = ~num;

		// Print result
		System.out.println("One's complement of " + num + " = " + onesComplement);
	}
}
