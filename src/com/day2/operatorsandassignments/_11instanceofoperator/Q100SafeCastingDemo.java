package com.day2.operatorsandassignments._11instanceofoperator;

//100. Program to safely cast an object using instanceof check.
//Parent class
class AnimalBase {
	// Method in parent class
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

//Child class extending AnimalBase
class DogChild extends AnimalBase {
	// Overriding sound method
	void sound() {
		System.out.println("Dog barks");
	}

	// Child-specific method
	void fetch() {
		System.out.println("Dog is fetching the ball!");
	}
}

public class Q100SafeCastingDemo {
	public static void main(String[] args) {
		AnimalBase a1 = new DogChild(); // Upcasting (DogChild → AnimalBase)
		AnimalBase a2 = new AnimalBase(); // Normal object of AnimalBase

		// Safe casting using instanceof
		if (a1 instanceof DogChild) {
			DogChild d = (DogChild) a1; // Safe downcast
			d.sound(); // Calls overridden method
			d.fetch(); // Calls child-specific method
		} else {
			System.out.println("a1 is not a DogChild");
		}

		if (a2 instanceof DogChild) {
			DogChild d2 = (DogChild) a2; // This will not execute
			d2.fetch();
		} else {
			System.out.println("a2 is not a DogChild");
		}
	}
}
