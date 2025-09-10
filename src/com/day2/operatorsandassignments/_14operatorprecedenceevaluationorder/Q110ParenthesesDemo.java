package com.day2.operatorsandassignments._14operatorprecedenceevaluationorder;
//110. Program to demonstrate difference in evaluation order with parentheses.
public class Q110ParenthesesDemo {
	
	    public static void main(String[] args) {
	        // Important Points:
	        // 1. Parentheses () have the highest precedence and force evaluation first.
	        // 2. Without parentheses, Java follows standard precedence rules.
	        // 3. Changing parentheses changes the grouping → changes the result.

	        int a = 10, b = 6, c = 3, d = 2;

	        // Expression without parentheses
	        int result1 = a + b * c & d | a >> 1;

	        // Expression with parentheses (different grouping)
	        int result2 = ((a + b) * c) & (d | (a >> 1));

	        System.out.println("Expression 1: a + b * c & d | a >> 1");
	        System.out.println("Values: a=10, b=6, c=3, d=2");
	        System.out.println("Result1 = " + result1);

	        // Step-by-step for Expression 1
	        int step1 = b * c;          // 6 * 3 = 18
	        int step2 = a + step1;      // 10 + 18 = 28
	        int step3 = step2 & d;      // 28 & 2 = 0
	        int step4 = a >> 1;         // 10 >> 1 = 5
	        int final1 = step3 | step4; // 0 | 5 = 5

	        System.out.println("Step1 = " + step1 + ", Step2 = " + step2 +
	                           ", Step3 = " + step3 + ", Step4 = " + step4);
	        System.out.println("Final1 = " + final1);

	        System.out.println("\nExpression 2: ((a + b) * c) & (d | (a >> 1))");
	        System.out.println("Result2 = " + result2);

	        // Step-by-step for Expression 2
	        int part1 = (a + b) * c;          // (10+6)*3 = 48
	        int part2 = a >> 1;               // 10 >> 1 = 5
	        int part3 = d | part2;            // 2 | 5 = 7
	        int final2 = part1 & part3;       // 48 & 7 = 0

	        System.out.println("Part1 = " + part1 + ", Part2 = " + part2 +
	                           ", Part3 = " + part3);
	        System.out.println("Final2 = " + final2);

	        /*
	         Expected Output:

	         Expression 1: a + b * c & d | a >> 1
	         Values: a=10, b=6, c=3, d=2
	         Result1 = 5
	         Step1 = 18, Step2 = 28, Step3 = 0, Step4 = 5
	         Final1 = 5

	         Expression 2: ((a + b) * c) & (d | (a >> 1))
	         Result2 = 0
	         Part1 = 48, Part2 = 5, Part3 = 7
	         Final2 = 0
	        */
	    }
	}
