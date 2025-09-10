package com.day2.operatorsandassignments._15newvsinstanceof;
//112. Program to show what happens when a parent class reference points to child class object.
public class Q112ParentChildReferenceDemo {

	    public static void main(String[] args) {
	        // KEY POINT 1: Parent reference → Child object (Upcasting)
	        Gadget g = new Smartphone();

	        // KEY POINT 2: Overridden method → Child class version executes
	        g.powerOn(); // Smartphone's method runs

	        // KEY POINT 3: Method not overridden → Parent version executes
	        g.powerOff(); // Gadget's method runs

	        // KEY POINT 4: Parent reference cannot access child-only methods
	        // g.takePhoto(); ❌ ERROR

	        // KEY POINT 5: Downcasting required for child-specific methods
	        Smartphone s = (Smartphone) g; // safe, because g actually refers to Smartphone
	        s.takePhoto();

	        /*
	         Expected Output:
	         Smartphone is booting up with Android...
	         Gadget is shutting down...
	         Smartphone is taking a photo...
	        */
	    }
	}
	
	
	class Gadget {
	    void powerOn() {
	        System.out.println("Gadget is powering on...");
	    }

	    void powerOff() {
	        System.out.println("Gadget is shutting down...");
	    }
	}

	class Smartphone extends Gadget {
	    @Override
	    void powerOn() {
	        System.out.println("Smartphone is booting up with Android...");
	    }

	    void takePhoto() {
	        System.out.println("Smartphone is taking a photo...");
	    }
	}
