package com.day2.operatorsandassignments._1arithmeticoperators;

import java.util.Scanner;

//52. Program to calculate the area and perimeter of a rectangle using arithmetic operators.
public class Q52RectangleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input length and width
		System.out.print("Enter length of rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double width = sc.nextDouble();

		// Calculate area and perimeter
		double area = length * width; // Area = length × width
		double perimeter = 2 * (length + width); // Perimeter = 2 × (length + width)

		// Print results
		System.out.println("Area of rectangle: " + area);
		System.out.println("Perimeter of rectangle: " + perimeter);
	}
}
