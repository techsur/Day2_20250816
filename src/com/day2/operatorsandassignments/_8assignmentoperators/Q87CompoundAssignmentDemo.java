package com.day2.operatorsandassignments._8assignmentoperators;
//87. Program to calculate compound assignment operations on an integer.
public class Q87CompoundAssignmentDemo {

	public static void main(String[] args) {
		int num = 10; // initial value
		System.out.println("Initial value: " + num);

		num += 5; // num = num + 5
		System.out.println("After += 5: " + num);

		num -= 3; // num = num - 3
		System.out.println("After -= 3: " + num);

		num *= 2; // num = num * 2
		System.out.println("After *= 2: " + num);

		num /= 4; // num = num / 4
		System.out.println("After /= 4: " + num);

		num %= 3; // num = num % 3
		System.out.println("After %= 3: " + num);
	}
}
