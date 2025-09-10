package com.day2.operatorsandassignments._1arithmeticoperators;

import java.util.Scanner;

//57. Program to convert temperature from Celsius to Fahrenheit and vice versa.
public class Q57TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Temperature Converter");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.print("Choose option (1 or 2): ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter temperature in Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = (celsius * 9 / 5) + 32;
			System.out.println(celsius + "°C = " + fahrenheit + "°F");
			break;
		case 2:
			System.out.print("Enter temperature in Fahrenheit: ");
			fahrenheit = sc.nextDouble();
			celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println(fahrenheit + "°F = " + celsius + "°C");
			break;
		default:
			System.out.println("Invalid choice!");
		}
	}
}
