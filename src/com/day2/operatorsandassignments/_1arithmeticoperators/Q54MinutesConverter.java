package com.day2.operatorsandassignments._1arithmeticoperators;

import java.util.Scanner;

//54. Program to convert minutes into hours and minutes.
public class Q54MinutesConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input total minutes
		System.out.print("Enter total minutes: ");
		int totalMinutes = sc.nextInt();

		// Calculate hours and remaining minutes
		int hours = totalMinutes / 60; // Integer division for hours
		int minutes = totalMinutes % 60; // Remainder for minutes

		// Print result
		System.out.println(totalMinutes + " minutes = " + hours + " hours and " + minutes + " minutes.");
	}
}
