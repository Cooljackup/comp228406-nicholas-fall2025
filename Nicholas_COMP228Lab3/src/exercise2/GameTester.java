// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 2

// Create a console application that demonstrates how to create objects of both classes.

package exercise2;

public abstract class GameTester {

    // Instance variables.
    public String name;
    public boolean fullTime;

    // GameTester class.
    public GameTester(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    // Getters.
    public String getName() { return name; }
    public boolean getFullTime() { return fullTime; }

    // Abstract method.
    public abstract double salaryAmount();

    // Information displaying method.
    public String gameTesterInformation() {
        return "Employee Name: " + getName() + "\nFull Time: " + getFullTime() + "\nSalary: $" + salaryAmount();
    }

}