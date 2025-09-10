package com.day2.operatorsandassignments._17classnotfound;
//115. Program to load a class dynamically using Class.forName() and handle ClassNotFoundException.
public class Q115DynamicClassLoading {

 public static void main(String[] args) {
     try {
         // KEY POINT 1: Provide fully qualified class name (packageName.ClassName)
         // Example: "java.util.ArrayList"
         Class<?> clazz = Class.forName("java.util.ArrayList");

         // KEY POINT 2: Successfully loaded class
         System.out.println("Class loaded successfully: " + clazz.getName());

         // KEY POINT 3: You can create an instance dynamically
         Object obj = clazz.getDeclaredConstructor().newInstance();
         System.out.println("Object created: " + obj);

     } catch (ClassNotFoundException e) {
         // KEY POINT 4: Handle case when class is not found
         System.out.println("Error: Class not found!");
     } catch (Exception e) {
         // KEY POINT 5: Handle other possible exceptions (e.g., InstantiationException)
         e.printStackTrace();
     }

     /*
       Expected Output (when class is found):
       Class loaded successfully: java.util.ArrayList
       Object created: []
       
       If class name is wrong (e.g., "java.util.UnknownClass"):
       Error: Class not found!
     */
 }
}
