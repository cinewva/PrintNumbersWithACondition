package com.itfactory;

/*
---
Problem 7.
Write a program that displays all the integers from -100 to 100, except those divisible by 2 or 3.
 */

public class Main {
    public static void main(String[] args) {
        // Implement a counter for the numbers
        int i = -100;
        // Loop that increments the numbers up to 100
        // Message to the user
        System.out.println("Displaying a sequence of numbers from -100 to 100 except those divisible by 2 or 3:");
        while (i < 101) {
            // Increment i with each loop iteration

            // Add a condition to not print numbers divisible by 2 or 3
            if (i % 2 != 0 && i % 3 != 0) {
                System.out.println("Number: " + i);
            }
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println("Numbers divisible by 2 or 3 for verification that they are excluded: " + i);
            }
            i = i + 1;
        }
    }
}