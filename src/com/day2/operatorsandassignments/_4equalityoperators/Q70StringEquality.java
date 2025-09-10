package com.day2.operatorsandassignments._4equalityoperators;

import java.util.Scanner;
//70. Program to check equality of two strings using == and .equals().
public class Q70StringEquality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input two strings
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();

		// Check equality using ==
		if (str1 == str2) {
			System.out.println("Using '==': Strings are equal");
		} else {
			System.out.println("Using '==': Strings are NOT equal");
		}

		// Check equality using .equals()
		if (str1.equals(str2)) {
			System.out.println("Using '.equals()': Strings are equal");
		} else {
			System.out.println("Using '.equals()': Strings are NOT equal");
		}
	}
}
