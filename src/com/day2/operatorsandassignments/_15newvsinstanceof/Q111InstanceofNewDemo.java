package com.day2.operatorsandassignments._15newvsinstanceof;
//111. Program to demonstrate creating object with new and checking type with instanceof.
public class Q111InstanceofNewDemo {
	// Program: Demonstrate creating object with 'new' and checking type with 'instanceof'

	public static void main(String[] args) {
        // KEY POINT 1: 'new' keyword is used to allocate memory and create object
        Vehicle v = new Car();  // Vehicle reference -> Car object (Polymorphism)
        Car c = new Car();      // Direct Car object

        // KEY POINT 2: 'instanceof' checks whether an object belongs to a class or subclass
        System.out.println("v instanceof Vehicle? " + (v instanceof Vehicle)); // true
        System.out.println("v instanceof Car? " + (v instanceof Car));         // true
        System.out.println("c instanceof Vehicle? " + (c instanceof Vehicle)); // true
        System.out.println("c instanceof Car? " + (c instanceof Car));         // true

        // KEY POINT 3: Example of false case (Car is not an unrelated type like Bike)
        System.out.println("c instanceof Bike? (if Bike class exists) → false");

        // KEY POINT 4: Dynamic method dispatch calls the method of actual object
        v.start(); // Car's start() called because v points to Car object
        c.start(); // Car's start()

        /*
         Expected Output:
         v instanceof Vehicle? true
         v instanceof Car? true
         c instanceof Vehicle? true
         c instanceof Car? true
         c instanceof Bike? (if Bike class exists) → false
         Car is starting with a key...
         Car is starting with a key...
        */
    }
}

	
	class Vehicle {
	    // Base class
	    void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	class Car extends Vehicle {
	    // Child class of Vehicle
	    @Override
	    void start() {
	        System.out.println("Car is starting with a key...");
	    }
	}
