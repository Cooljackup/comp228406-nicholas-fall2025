// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 2

// Create a console application that demonstrates how to create objects of both classes.

package exercise2;

public class FullTimeGameTester extends GameTester {

    // Instance variables.
    public double baseSalary = 3000;

    // FullTimeGameTester class.
    public FullTimeGameTester(String name, boolean fullTime) {
        super(name, true);
    }

    // Method to calculate a full time game tester's base salary.
    public double salaryAmount() { return baseSalary; }

}