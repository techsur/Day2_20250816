package com.day2.operatorsandassignments._11instanceofoperator;

//98. Program to check if an object is instance of a particular class.
public class Q98InstanceOfExample {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();

		// Checking using instanceof
		System.out.println("a is an instance of Animal: " + (a instanceof Animal));
		System.out.println("d is an instance of Dog: " + (d instanceof Dog));
		System.out.println("d is an instance of Animal: " + (d instanceof Animal));
		System.out.println("a is an instance of Dog: " + (a instanceof Dog));
	}
}

class Animal {
	// Base class
}

class Dog extends Animal {
	// Subclass of Animal
}
