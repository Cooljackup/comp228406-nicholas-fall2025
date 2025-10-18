// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 2

// Create a console application that demonstrates how to create objects of both classes.

package exercise2;

public class PartTimeGameTester extends GameTester {

    // Instance variables.
    public double hourlyRate = 20;
    public double numberOfHoursWorked;

    // PartTimeGameTester class.
    public PartTimeGameTester(String name, double numberOfHoursWorked) {
        super(name, false);
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    // Getter.
    public double getNumberOfHoursWorked() { return numberOfHoursWorked; }

    // Method to calculate a part time game tester's hourly rate.
    public double salaryAmount() {
        return numberOfHoursWorked * hourlyRate;
    }

}