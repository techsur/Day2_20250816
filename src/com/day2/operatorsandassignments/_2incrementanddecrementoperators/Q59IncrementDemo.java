package com.day2.operatorsandassignments._2incrementanddecrementoperators;
//59. Program to demonstrate pre-increment and post-increment difference.
public class Q59IncrementDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;

		// Pre-increment: increment happens before using the value
		int pre = ++a; // a becomes 6, then assigned to pre
		System.out.println("After pre-increment:");
		System.out.println("a = " + a); // 6
		System.out.println("pre = " + pre); // 6

		// Post-increment: increment happens after using the value
		int post = b++; // b assigned to post (5), then b becomes 6
		System.out.println("After post-increment:");
		System.out.println("b = " + b); // 6
		System.out.println("post = " + post); // 5
	}
}
