// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 3

// Write a Java application that keeps track of mortgages and computes the total amount owed at any time (mortgage amount + interest).

package exercise3;

// Imports necessary packages.
import javax.swing.*;

public class ProcessMortgage {
    public static void main(String[] args) {

        // Instance variables.
        Mortgage[] mortgages = new Mortgage[3];
        int mortgageNumber;
        String customerName;
        double mortgageAmount;
        double interestRate = 0;
        int term;
        String mortgageType;

        // Prompts the user to enter the current interest rate. (Prime + type of mortgage interest rate.)
        try {
            interestRate = Double.parseDouble(JOptionPane.showInputDialog("Please enter the current interest rate (E.g. 5 for 5%): "));
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting to 5% interest rate.");
            interestRate = 5;
        }

        // Goes through each mortgage.
        for (int i = 0; i < mortgages.length; i++) {
            try {
                mortgageNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter Mortgage Number:"));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting Mortgage Number #1.");
                mortgageNumber = 1;
            }
            customerName = JOptionPane.showInputDialog("Please enter the Customer's Name:");

            // Checks the mortgage amount.
            try {
                mortgageAmount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Mortgage Amount (Maximum of $300,000.):"));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting to $100,000.");
                mortgageAmount = 100000;
            }

            // Gets the users input on how long the term is for the mortgage and whether it is a business or personal mortgage.
            try {
                term = Integer.parseInt(JOptionPane.showInputDialog("Please enter the term of your mortgage (1, 3, or 5 years.):"));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting to 1 year term.");
                term = 1;
            }
            mortgageType = JOptionPane.showInputDialog("Please enter the type of mortgage (Business or Personal):");

            if (mortgageType.equalsIgnoreCase("Business")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, term);
            } else if (mortgageType.equalsIgnoreCase("Personal")) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, term);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting to a Personal Mortgage.");
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, term);
            }
        }
        
        // Loops through the inputs then displays the information the user inputted with each mortgage.
        for (Mortgage mortgage : mortgages) {
            JOptionPane.showMessageDialog(null, mortgage.getMortgageInfo());
        }
    }
}