package com.day2.operatorsandassignments._6bitwiseoperators;

import java.util.Scanner;
//82. Program to count number of set bits in an integer using bitwise operators.
public class Q82CountSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();

		int count = 0;
		int n = num; // preserve original number

		// Count set bits
		while (n != 0) {
			count += (n & 1); // add 1 if last bit is set
			n = n >> 1; // right shift by 1
		}

		// Print result
		System.out.println("Number of set bits in " + num + " = " + count);
	}
}
