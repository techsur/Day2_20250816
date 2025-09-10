package com.day2.operatorsandassignments._5stringconcatenationoperator;
//75. Program to merge two arrays of strings into a single string.
public class Q75MergeStringArrays {

	public static void main(String[] args) {
		String[] array1 = { "Hello", "World" };
		String[] array2 = { "Java", "Programming" };

		// Merge arrays into a single string
		String merged = "";
		for (String str : array1) {
			merged += str + " "; // add a space between elements
		}
		for (String str : array2) {
			merged += str + " ";
		}

		// Trim trailing space and print result
		merged = merged.trim();
		System.out.println("Merged String: " + merged);
	}
}
