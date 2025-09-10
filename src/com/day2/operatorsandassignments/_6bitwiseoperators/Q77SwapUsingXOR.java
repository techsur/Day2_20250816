package com.day2.operatorsandassignments._6bitwiseoperators;

import java.util.Scanner;
//77. Program to swap two numbers using XOR.
public class Q77SwapUsingXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter first number (a): ");
		int a = sc.nextInt();
		System.out.print("Enter second number (b): ");
		int b = sc.nextInt();

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		// Swap using XOR
		a = a ^ b; // step 1
		b = a ^ b; // step 2
		a = a ^ b; // step 3

		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
