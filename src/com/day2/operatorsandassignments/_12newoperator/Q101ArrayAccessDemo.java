package com.day2.operatorsandassignments._12newoperator;
//101. Program to create an object of a class and call its method.
public class Q101ArrayAccessDemo {

	public static void main(String[] args) {
		// Important Points:
		// 1. Array stores multiple values of the same type in a single variable.
		// 2. Index starts from 0 and goes up to length-1.
		// 3. We can access elements using array[index].

		// Declare and initialize an array
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Print array elements using index
		System.out.println("Accessing elements using index:");
		System.out.println("First element: " + numbers[0]);
		System.out.println("Second element: " + numbers[1]);
		System.out.println("Third element: " + numbers[2]);

		// Print array elements using loop
		System.out.println("\nAccessing elements using loop:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + " = " + numbers[i]);
		}
	}
}
