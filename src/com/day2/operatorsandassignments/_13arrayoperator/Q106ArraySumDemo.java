package com.day2.operatorsandassignments._13arrayoperator;
//107. Program to traverse an array and find sum of all elements.
public class Q106ArraySumDemo {

	    public static void main(String[] args) {
	        // Important Points:
	        // 1. Traversing an array means visiting each element one by one.
	        // 2. Use a loop (for, while, or for-each) to traverse the array.
	        // 3. Keep a variable (sum) to accumulate the total of all elements.

	        // Initializing an array
	        int[] numbers = {5, 10, 15, 20, 25};

	        int sum = 0; // variable to hold the sum

	        // Traversing array and adding each element to sum
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }

	        // Printing the result
	        System.out.println("Sum of all elements: " + sum);

	        /*
	         Expected Output:
	         Sum of all elements: 75
	        */
	    }
	}
