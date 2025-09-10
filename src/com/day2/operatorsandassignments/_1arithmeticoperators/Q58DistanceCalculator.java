package com.day2.operatorsandassignments._1arithmeticoperators;

import java.util.Scanner;
//58. Program to calculate distance traveled given speed and time.
public class Q58DistanceCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input speed and time
		System.out.print("Enter speed (in km/h): ");
		double speed = sc.nextDouble();
		System.out.print("Enter time (in hours): ");
		double time = sc.nextDouble();

		// Calculate distance using formula: distance = speed × time
		double distance = speed * time;

		// Print result
		System.out.println("Distance traveled: " + distance + " km");
	}
}
