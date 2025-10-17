// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 1

// Write a Java application that implements different types of insurance policies for employees of an organization.

package exercise1;

public abstract class Insurance {

    // Instance variables.
    public String insuranceType;
    public double monthlyCost;

    // Insurance class.
    public Insurance(String insuranceType, double monthlyCost) {
        this.insuranceType = insuranceType;
        this.monthlyCost = monthlyCost;
    }

    // Getters and setters.
    public String getInsuranceType() { return insuranceType; }
    public double getMonthlyCost() { return monthlyCost; }
    public void setMonthlyCost(double monthlyCost) { this.monthlyCost = monthlyCost; }

    // Abstract methods.
    public abstract void setInsuranceCost();
    public abstract String displayInfo();

}