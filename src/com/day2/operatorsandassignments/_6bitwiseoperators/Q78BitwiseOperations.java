package com.day2.operatorsandassignments._6bitwiseoperators;
//78. Program to find the bitwise AND, OR, XOR of two numbers.
import java.util.Scanner;

public class Q78BitwiseOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		// Perform bitwise operations
		int andResult = num1 & num2;
		int orResult = num1 | num2;
		int xorResult = num1 ^ num2;

		// Print results
		System.out.println("Bitwise AND of " + num1 + " & " + num2 + " = " + andResult);
		System.out.println("Bitwise OR of " + num1 + " | " + num2 + " = " + orResult);
		System.out.println("Bitwise XOR of " + num1 + " ^ " + num2 + " = " + xorResult);
	}
}
