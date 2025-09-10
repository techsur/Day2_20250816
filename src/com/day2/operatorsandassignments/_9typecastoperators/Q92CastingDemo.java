package com.day2.operatorsandassignments._9typecastoperators;
//92. Program to demonstrate explicit and implicit casting between primitives.
public class Q92CastingDemo {

	public static void main(String[] args) {

		// ---------- Implicit Casting (Widening) ----------
		// Smaller type is automatically converted into a larger type
		int intVal = 100;
		double doubleVal = intVal; // int -> double (implicit)

		System.out.println("Implicit Casting:");
		System.out.println("Integer value: " + intVal);
		System.out.println("Converted to double: " + doubleVal);

		// ---------- Explicit Casting (Narrowing) ----------
		// Larger type is manually converted into a smaller type
		double d = 99.99;
		int i = (int) d; // double -> int (explicit)

		System.out.println("\nExplicit Casting:");
		System.out.println("Double value: " + d);
		System.out.println("Converted to int: " + i);

		// ---------- More Examples ----------
		char ch = 'A';
		int ascii = ch; // char -> int (implicit, ASCII value)
		byte b = (byte) ascii; // int -> byte (explicit)

		System.out.println("\nMore Examples:");
		System.out.println("Character: " + ch);
		System.out.println("ASCII value (char -> int): " + ascii);
		System.out.println("Converted to byte (int -> byte): " + b);
	}
}
