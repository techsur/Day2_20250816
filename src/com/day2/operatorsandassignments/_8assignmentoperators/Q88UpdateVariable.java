package com.day2.operatorsandassignments._8assignmentoperators;
//88. Program to update a variable by adding, subtracting, multiplying, and dividing using assignment operators.
public class Q88UpdateVariable {

	public static void main(String[] args) {
		int value = 20; // initial value
		System.out.println("Initial value: " + value);

		value += 10; // add 10
		System.out.println("After adding 10: " + value);

		value -= 5; // subtract 5
		System.out.println("After subtracting 5: " + value);

		value *= 3; // multiply by 3
		System.out.println("After multiplying by 3: " + value);

		value /= 5; // divide by 5
		System.out.println("After dividing by 5: " + value);
	}
}
