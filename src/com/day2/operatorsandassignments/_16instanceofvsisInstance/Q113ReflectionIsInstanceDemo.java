package com.day2.operatorsandassignments._16instanceofvsisInstance;
//113. Program to demonstrate Class.isInstance() with reflection.
public class Q113ReflectionIsInstanceDemo {

 public static void main(String[] args) throws Exception {
     // KEY POINT 1: Create an object of child class
     Laptop l = new GamingLaptop();

     // KEY POINT 2: Obtain Class objects using reflection
     Class<?> laptopClass = Laptop.class;
     Class<?> gamingLaptopClass = GamingLaptop.class;

     // KEY POINT 3: Use isInstance() to check type dynamically
     System.out.println("Is l an instance of Laptop? " + laptopClass.isInstance(l));
     System.out.println("Is l an instance of GamingLaptop? " + gamingLaptopClass.isInstance(l));
     System.out.println("Is l an instance of String? " + String.class.isInstance(l));

     /*
       Expected Output:
       Is l an instance of Laptop? true
       Is l an instance of GamingLaptop? true
       Is l an instance of String? false
     */

     // KEY POINT 4: Difference from 'instanceof'
     // instanceof is checked at compile time, but isInstance() works at runtime with reflection.
 }
}


//Program: Demonstrate Class.isInstance() with reflection in Java

class Laptop {
 void specs() {
     System.out.println("This is a generic laptop.");
 }
}

class GamingLaptop extends Laptop {
 @Override
 void specs() {
     System.out.println("This is a high-performance gaming laptop.");
 }
}
