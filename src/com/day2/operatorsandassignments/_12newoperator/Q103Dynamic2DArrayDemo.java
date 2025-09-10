package com.day2.operatorsandassignments._12newoperator;
//103. Program to create a 2D array dynamically using new.
public class Q103Dynamic2DArrayDemo {

	public static void main(String[] args) {
		// Important Points:
		// 1. A 2D array in Java is an array of arrays.
		// 2. It can be created dynamically using the 'new' keyword.
		// 3. Syntax: dataType[][] arrayName = new dataType[rows][cols];
		// 4. Default values are assigned initially (0 for int, false for boolean,
		// etc.).
		// 5. We can manually assign values after creation.

		// Creating a 2D array of size 3x3 (3 rows, 3 columns)
		int[][] matrix = new int[3][3];

		// Initializing values dynamically
		int value = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = value++;
			}
		}

		// Printing the 2D array
		System.out.println("2D Array elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); // move to next line after each row
		}

		/*
		 * Expected Output: 2D Array elements: 1 2 3 4 5 6 7 8 9
		 */
	}
}
