package com.day2.operatorsandassignments._1arithmeticoperators;

import java.util.Scanner;

//53. Program to calculate simple interest and compound interest.
public class Q53InterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input principal, rate, and time
		System.out.print("Enter principal amount: ");
		double principal = sc.nextDouble();
		System.out.print("Enter rate of interest (in %): ");
		double rate = sc.nextDouble();
		System.out.print("Enter time period (in years): ");
		double time = sc.nextDouble();
		System.out.print("Enter number of times interest is compounded per year (for CI): ");
		double n = sc.nextDouble();

		// Calculate Simple Interest
		double simpleInterest = (principal * rate * time) / 100;

		// Calculate Compound Interest: A = P(1 + r/n)^(n*t)
		double compoundInterest = principal * Math.pow(1 + (rate / (100 * n)), n * time) - principal;

		// Print results
		System.out.println("Simple Interest: " + simpleInterest);
		System.out.println("Compound Interest: " + compoundInterest);
	}
}
