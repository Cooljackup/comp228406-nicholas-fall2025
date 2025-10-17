// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 1

// Write a Java application that implements different types of insurance policies for employees of an organization.

package exercise1;

public class Life extends Insurance {

    // Life class.
    public Life(String insuranceType, double monthlyCost) {
        super(insuranceType, monthlyCost);
    }

    // Methods to set the insurance cost and display the information.
    public void setInsuranceCost() { setMonthlyCost(getMonthlyCost()); }
    public String displayInfo() { return "Insurance Type: " + getInsuranceType() + "\nCategory: Life Insurance" + "\nMonthly Cost: $" + getMonthlyCost(); }

}