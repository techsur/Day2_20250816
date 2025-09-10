package com.day2.operatorsandassignments._8assignmentoperators;

import java.util.Scanner;
//89. Program to increment a variable by itself plus another number using +=.
public class Q89IncrementByItself {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input initial value
		System.out.print("Enter initial value: ");
		int num = sc.nextInt();

		// Input the number to add
		System.out.print("Enter number to add: ");
		int add = sc.nextInt();

		System.out.println("Before increment: " + num);

		// Increment by itself plus another number
		num += (num + add); // equivalent to num = num + (num + add)

		System.out.println("After incrementing by itself + " + add + ": " + num);
	}
}
