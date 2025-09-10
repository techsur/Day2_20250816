package com.day2.operatorsandassignments._2incrementanddecrementoperators;

public class Q60DecrementDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;

		// Pre-decrement: decrement happens before using the value
		int pre = --a; // a becomes 4, then assigned to pre
		System.out.println("After pre-decrement:");
		System.out.println("a = " + a); // 4
		System.out.println("pre = " + pre); // 4

		// Post-decrement: decrement happens after using the value
		int post = b--; // b assigned to post (5), then b becomes 4
		System.out.println("After post-decrement:");
		System.out.println("b = " + b); // 4
		System.out.println("post = " + post); // 5
	}
}
