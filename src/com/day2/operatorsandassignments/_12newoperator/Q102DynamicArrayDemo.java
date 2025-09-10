package com.day2.operatorsandassignments._12newoperator;

//102. Program to dynamically create an array using new and initialize values.
public class Q102DynamicArrayDemo {

	public static void main(String[] args) {
		// Important Points:
		// 1. Arrays can be created dynamically using the 'new' keyword.
		// 2. Size must be specified when creating an array using 'new'.
		// 3. Values can be assigned to each index after creation.
		// 4. Default values: int -> 0, float -> 0.0, boolean -> false, object -> null.

		// Creating an integer array dynamically of size 5
		int[] numbers = new int[5];

		// Initializing values
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		// Printing initialized array values
		System.out.println("Array elements:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + " = " + numbers[i]);
		}
	}
}
