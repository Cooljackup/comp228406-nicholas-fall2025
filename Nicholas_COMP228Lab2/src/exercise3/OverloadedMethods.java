// COMP228-406 - Lab 2 - Nicholas Bonneville
// Lab 2 - Exercise 3

// Write a Java application that implements a set of three overloaded static methods.

package exercise3;

public class OverloadedMethods {

    // Overloading a method with 2 ints.
    public static int overloadedSum(int a, int b) {
        return a + b;
    }

    // Overloading a method with 2 doubles.
    public static double overloadedSum(double a, double b) {
        return a + b;
    }

    // Overloading a method with 2 strings.
    public static String overloadedSum(String a, String b) {
        return a + b;
    }
}