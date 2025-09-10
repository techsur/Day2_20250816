package com.day2.operatorsandassignments._14operatorprecedenceevaluationorder;
//109. Program to evaluate mixed arithmetic and bitwise operations.
public class Q109MixedArithmeticBitwise {

	    public static void main(String[] args) {
	        // Important Points:
	        // 1. Arithmetic operators (*, /, %) have higher precedence than +, -.
	        // 2. Bitwise AND (&), XOR (^), OR (|) have lower precedence than arithmetic.
	        // 3. Left shift (<<) and right shift (>>) have higher precedence than bitwise AND, OR, XOR.
	        // 4. Parentheses can change evaluation order.
	        // 5. Operators with same precedence are evaluated Left to Right.

	        int a = 10, b = 6, c = 3, d = 2;

	        // Expression mixing arithmetic and bitwise
	        int result = a + b * c & d | a >> 1;

	        System.out.println("Expression: a + b * c & d | a >> 1");
	        System.out.println("Values: a=10, b=6, c=3, d=2");
	        System.out.println("Result = " + result);

	        // Step-by-step breakdown:
	        int step1 = b * c;        // 6 * 3 = 18   (arithmetic first)
	        int step2 = a + step1;    // 10 + 18 = 28
	        int step3 = step2 & d;    // 28 & 2 = 0   (bitwise AND)
	        int step4 = a >> 1;       // 10 >> 1 = 5  (right shift by 1)
	        int finalResult = step3 | step4; // 0 | 5 = 5 (bitwise OR)

	        System.out.println("Step 1 (b * c) = " + step1);
	        System.out.println("Step 2 (a + (b*c)) = " + step2);
	        System.out.println("Step 3 ((a+b*c) & d) = " + step3);
	        System.out.println("Step 4 (a >> 1) = " + step4);
	        System.out.println("Final Result (step3 | step4) = " + finalResult);

	        /*
	         Expected Output:
	         Expression: a + b * c & d | a >> 1
	         Values: a=10, b=6, c=3, d=2
	         Result = 5
	         Step 1 (b * c) = 18
	         Step 2 (a + (b*c)) = 28
	         Step 3 ((a+b*c) & d) = 0
	         Step 4 (a >> 1) = 5
	         Final Result (step3 | step4) = 5
	        */
	    }
	}
