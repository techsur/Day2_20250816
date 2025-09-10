package com.day2.operatorsandassignments._13arrayoperator;

//107. Program to reverse an array using index access.
public class Q107ReverseArrayDemo {

	    public static void main(String[] args) {
	        // Important Points:
	        // 1. To reverse an array, we swap elements from start and end.
	        // 2. Use two indexes: one starting from 0 (left), another from last index (right).
	        // 3. Swap elements until left < right.
	        // 4. This reverses the array in-place (no extra array needed).

	        // Original array
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Printing original array
	        System.out.print("Original Array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Reversing using index access
	        int left = 0;
	        int right = numbers.length - 1;

	        while (left < right) {
	            // Swap numbers[left] and numbers[right]
	            int temp = numbers[left];
	            numbers[left] = numbers[right];
	            numbers[right] = temp;

	            // Move indices
	            left++;
	            right--;
	        }

	        // Printing reversed array
	        System.out.print("Reversed Array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        /*
	         Expected Output:
	         Original Array: 10 20 30 40 50 
	         Reversed Array: 50 40 30 20 10
	        */
	    }
	}
