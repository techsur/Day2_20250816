package com.day2.operatorsandassignments._2incrementanddecrementoperators;

import java.util.Scanner;
//63. Program to print all even numbers from 1 to N using increment operator.
public class Q63EvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input N
		System.out.print("Enter the value of N: ");
		int N = sc.nextInt();

		System.out.println("Even numbers from 1 to " + N + ":");

		int i = 2; // start from first even number
		while (i <= N) {
			System.out.print(i + " ");
			i += 2; // increment by 2 to get next even number
		}
	}
}
