package com.day2.operatorsandassignments._13arrayoperator;

public class Q104ArrayAccessDemo {

	public static void main(String[] args) {
		// Important Points:
		// 1. Arrays in Java are fixed in size once created.
		// 2. Array indexing starts from 0 and goes till length-1.
		// 3. Accessing an index out of range causes ArrayIndexOutOfBoundsException.
		// 4. We can access elements using array[index].

		// Creating and initializing an array
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Printing all elements of the array using a for loop
		System.out.println("Array elements:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + " = " + numbers[i]);
		}

		/*
		 * Expected Output: Array elements: Element at index 0 = 10 Element at index 1 =
		 * 20 Element at index 2 = 30 Element at index 3 = 40 Element at index 4 = 50
		 */
	}
}
