package com.day2.operatorsandassignments._2incrementanddecrementoperators;

import java.util.Scanner;
//61. Program to swap two numbers using increment/decrement operators only.
public class Q61SwapUsingIncDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter first number (a): ");
		int a = sc.nextInt();
		System.out.print("Enter second number (b): ");
		int b = sc.nextInt();

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		// Swap using only increment/decrement operators
		a = a + b; // step 1: a holds sum
		b = a - b; // step 2: b = (a+b) - b = a
		a = a - b; // step 3: a = (a+b) - a = b

		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
