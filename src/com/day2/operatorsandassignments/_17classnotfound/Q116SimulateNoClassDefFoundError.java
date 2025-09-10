package com.day2.operatorsandassignments._17classnotfound;

public class Q116SimulateNoClassDefFoundError {
	// Program: Simulate NoClassDefFoundError
	// Key Points:
	// 1. NoClassDefFoundError occurs at runtime if a class available at compile time is missing at execution time.
	// 2. Unlike ClassNotFoundException, this is an Error, not an Exception.

	    public static void main(String[] args) {
	        // Compile-time: The compiler sees Helper class and compiles successfully
	    	Q116Helper helper = new Q116Helper();
	        helper.showMessage();

	        /*
	          STEPS TO SIMULATE:
	          1. Compile both files:
	             javac Helper.java SimulateNoClassDefFoundError.java
	          2. Delete Helper.class file:
	             del Helper.class   (Windows)
	             rm Helper.class    (Linux/Mac)
	          3. Run the program:
	             java SimulateNoClassDefFoundError

	          EXPECTED OUTPUT:
	          Exception in thread "main" java.lang.NoClassDefFoundError: Helper
	                  at SimulateNoClassDefFoundError.main(SimulateNoClassDefFoundError.java:10)
	          Caused by: java.lang.ClassNotFoundException: Helper
	        */
	    }
	}
