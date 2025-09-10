package com.day2.operatorsandassignments._9typecastoperators;
//93. Program to convert char to int and print ASCII value.
public class Q93CharToASCII {

	public static void main(String[] args) {
		// Example character
		char ch = 'A';

		// Convert char to int (gives ASCII value)
		int asciiValue = ch; // implicit conversion

		System.out.println("Character: " + ch);
		System.out.println("ASCII Value: " + asciiValue);
	}
}
