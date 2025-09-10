package com.day2.operatorsandassignments._13arrayoperator;

//105. Program to update array elements at specific index.
public class Q105ArrayUpdateDemo {
	public static void main(String[] args) {

		        // Important Points:
		        // 1. Arrays in Java are mutable, meaning their elements can be updated.
		        // 2. To update, simply assign a new value at a specific index.
		        // 3. Index must be within the valid range (0 to length-1), otherwise
		        //    ArrayIndexOutOfBoundsException will occur.

		        // Creating and initializing an array
		        int[] numbers = {5, 10, 15, 20, 25};

		        System.out.println("Original Array:");
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.println("Index " + i + " = " + numbers[i]);
		        }

		        // Updating elements at specific indices
		        numbers[1] = 100;  // Update element at index 1
		        numbers[3] = 200;  // Update element at index 3

		        System.out.println("\nUpdated Array:");
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.println("Index " + i + " = " + numbers[i]);
		        }

		        /*
		         Expected Output:
		         Original Array:
		         Index 0 = 5
		         Index 1 = 10
		         Index 2 = 15
		         Index 3 = 20
		         Index 4 = 25

		         Updated Array:
		         Index 0 = 5
		         Index 1 = 100
		         Index 2 = 15
		         Index 3 = 200
		         Index 4 = 25
		        */
		    }
		}
