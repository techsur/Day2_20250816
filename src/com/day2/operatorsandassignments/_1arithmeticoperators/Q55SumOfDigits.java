package com.day2.operatorsandassignments._1arithmeticoperators;

import java.util.Scanner;

//55. Program to calculate sum of digits of a number.
public class Q55SumOfDigits {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int temp = num;
	        int sum = 0;

	        // Calculate sum of digits
	        while (temp != 0) {
	            sum += temp % 10; // Add last digit to sum
	            temp /= 10;       // Remove last digit
	        }

	        // Print result
	        System.out.println("Sum of digits of " + num + " = " + sum);
	    }
	}

