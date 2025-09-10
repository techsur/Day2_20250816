package com.day2.operatorsandassignments._6bitwiseoperators;

import java.util.Scanner;
//80. Program to shift a number left by 2 bits and right by 2 bits.
public class Q80BitShift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input number
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Left shift by 2 bits
		int leftShift = num << 2;

		// Right shift by 2 bits
		int rightShift = num >> 2;

		// Print results
		System.out.println("Original number: " + num);
		System.out.println("After left shift by 2 bits: " + leftShift);
		System.out.println("After right shift by 2 bits: " + rightShift);
	}
}
