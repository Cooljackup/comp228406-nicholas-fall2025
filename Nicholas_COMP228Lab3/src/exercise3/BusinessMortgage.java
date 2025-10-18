// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 3

// Write a Java application that keeps track of mortgages and computes the total amount owed at any time (mortgage amount + interest).

package exercise3;

public class BusinessMortgage extends Mortgage {

    // BusinessMortgage constructor. (With 1% prime rate.)
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, primeRate + 0.01, term);
    }
}