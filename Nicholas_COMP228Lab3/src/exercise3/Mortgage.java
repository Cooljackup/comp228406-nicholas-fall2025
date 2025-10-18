// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 3

// Write a Java application that keeps track of mortgages and computes the total amount owed at any time (mortgage amount + interest).

package exercise3;

public class Mortgage extends MortgageConstants {

    // Instance variables.
    public int mortgageNumber;
    public String customerName;
    public double mortgageAmount;
    public double interestRate;
    public int term;
    public double totalOwed;

    // Mortgage class.
    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        if (mortgageAmount > maximumMortgageAmount ) {
            this.mortgageAmount = maximumMortgageAmount;
        } else {
            this.mortgageAmount = mortgageAmount;
        }

        if (term != shortTerm && term != mediumTerm && term != longTerm) {
            this.term = shortTerm;
        } else {
            this.term = term;
        }

        this.interestRate = interestRate;
    }

    // Mortgage info method to display all the mortgage information.
    public String getMortgageInfo() {
        totalOwed = mortgageAmount + (mortgageAmount * interestRate * term);
        return "Bank Name: " + bankName +
                "\nMortgage Number: " + mortgageNumber +
                "\nCustomer Name: " + customerName +
                "\nMortgage Amount: " + mortgageAmount +
                "\nInterest Rate: "+ (interestRate * 100) + "%" +
                "\nMortgage Term: " + term + " year(s)" +
                "\nTotal Amount Owed: " + totalOwed;
    }
}