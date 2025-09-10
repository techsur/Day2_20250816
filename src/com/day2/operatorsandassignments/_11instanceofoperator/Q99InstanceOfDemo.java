package com.day2.operatorsandassignments._11instanceofoperator;

//99. Program to demonstrate instanceof with a parent and child class.
public class Q99InstanceOfDemo {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child(); // Upcasting Child to Parent

		// Checking using instanceof
		System.out.println("p is instance of Parent: " + (p instanceof Parent));
		System.out.println("p is instance of Child: " + (p instanceof Child));

		System.out.println("c is instance of Child: " + (c instanceof Child));
		System.out.println("c is instance of Parent: " + (c instanceof Parent));

		System.out.println("pc is instance of Parent: " + (pc instanceof Parent));
		System.out.println("pc is instance of Child: " + (pc instanceof Child));
	}
}

class Parent {
	// Parent class
}

class Child extends Parent {
	// Child class
}
