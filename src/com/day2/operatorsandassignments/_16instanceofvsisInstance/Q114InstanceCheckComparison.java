package com.day2.operatorsandassignments._16instanceofvsisInstance;
//114. Program to compare instanceof vs isInstance() behavior on same object.
public class Q114InstanceCheckComparison {

 public static void main(String[] args) {
     // KEY POINT 1: Create object of child class
     Device d = new Smartphone();

     // KEY POINT 2: instanceof operator (compile-time check, evaluated at runtime)
     System.out.println("Using instanceof:");
     System.out.println("d instanceof Device: " + (d instanceof Device));
     System.out.println("d instanceof Smartphone: " + (d instanceof Smartphone));
     // Below would cause compile-time error (incompatible types):
     // System.out.println(d instanceof String);

     System.out.println();

     // KEY POINT 3: isInstance() method (runtime check using reflection)
     System.out.println("Using isInstance():");
     System.out.println("Device.class.isInstance(d): " + Device.class.isInstance(d));
     System.out.println("Smartphone.class.isInstance(d): " + Smartphone.class.isInstance(d));
     System.out.println("String.class.isInstance(d): " + String.class.isInstance(d)); // returns false, no error

     /*
       Expected Output:
       Using instanceof:
       d instanceof Device: true
       d instanceof Smartphone: true

       Using isInstance():
       Device.class.isInstance(d): true
       Smartphone.class.isInstance(d): true
       String.class.isInstance(d): false
     */

     // KEY POINT 4:
     // - instanceof: compile-time + runtime, cannot compare unrelated types.
     // - isInstance(): runtime only, safe for any Class object.
 }
}


class Device {
 void info() {
     System.out.println("This is a generic device.");
 }
}

class Smartphone extends Device {
 @Override
 void info() {
     System.out.println("This is a smartphone.");
 }
}
