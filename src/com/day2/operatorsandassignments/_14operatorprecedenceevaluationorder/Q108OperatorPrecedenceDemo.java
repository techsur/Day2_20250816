package com.day2.operatorsandassignments._14operatorprecedenceevaluationorder;
//108. Program to calculate expression a + b * c / d - e and demonstrate precedence.
public class Q108OperatorPrecedenceDemo {

	    public static void main(String[] args) {
	        // Important Points:
	        // 1. In Java, operator precedence determines the order of evaluation.
	        // 2. Precedence (high to low in this case): *, /  >  +, -
	        // 3. Associativity of *, /, +, - is Left to Right.
	        // 4. So in a + b * c / d - e:
	        //    First b * c is evaluated,
	        //    then result / d,
	        //    then a + result,
	        //    then final - e.

	        int a = 10, b = 20, c = 30, d = 10, e = 5;

	        // Expression: a + b * c / d - e
	        int result = a + b * c / d - e;

	        System.out.println("Expression: a + b * c / d - e");
	        System.out.println("Values: a=10, b=20, c=30, d=10, e=5");
	        System.out.println("Result = " + result);

	        // Step-by-step explanation:
	        int step1 = b * c;        // 20 * 30 = 600
	        int step2 = step1 / d;    // 600 / 10 = 60
	        int step3 = a + step2;    // 10 + 60 = 70
	        int finalResult = step3 - e; // 70 - 5 = 65

	        System.out.println("Step 1 (b * c) = " + step1);
	        System.out.println("Step 2 ((b * c) / d) = " + step2);
	        System.out.println("Step 3 (a + result) = " + step3);
	        System.out.println("Final Result ( - e ) = " + finalResult);

	        /*
	         Expected Output:
	         Expression: a + b * c / d - e
	         Values: a=10, b=20, c=30, d=10, e=5
	         Result = 65
	         Step 1 (b * c) = 600
	         Step 2 ((b * c) / d) = 60
	         Step 3 (a + result) = 70
	         Final Result ( - e ) = 65
	        */
	    }
	}
