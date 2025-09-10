package com.day2.operatorsandassignments._5stringconcatenationoperator;

import java.util.Scanner;
//76. Program to append a character at the end of a string.
public class Q76AppendCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input string
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		// Input character to append
		System.out.print("Enter a character to append: ");
		char ch = sc.next().charAt(0);

		// Append character using + operator
		String newStr = str + ch;

		// Print result
		System.out.println("String after appending: " + newStr);
	}
}
