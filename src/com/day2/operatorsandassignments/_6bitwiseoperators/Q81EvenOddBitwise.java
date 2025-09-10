package com.day2.operatorsandassignments._6bitwiseoperators;

import java.util.Scanner;
//81. Program to check if a number is even or odd using bitwise operator.
public class Q81EvenOddBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Check even or odd using bitwise AND
		if ((num & 1) == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}
}
