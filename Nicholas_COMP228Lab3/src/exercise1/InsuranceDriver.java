// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 1

// Write a Java application that implements different types of insurance policies for employees of an organization.

package exercise1;

// Imports necessary packages.
import javax.swing.*;

public class InsuranceDriver {
    public static void main(String[] args) {

        // Instance variables.
        Insurance[] insurancePolicies = new Insurance[2];

        for (int i = 0; i < insurancePolicies.length; i++) {
            String category = JOptionPane.showInputDialog("Please enter the insurance category:");
            String description = JOptionPane.showInputDialog("Please enter the insurance description:");
            double cost = 0;

            // Takes the user's input for the cost. If nothing is provided, it is set to 0.
            try {
                cost = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the insurance's monthly cost: "));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR. An invalid number was provided. Defaulting to 0.");
            }

            // Checks to see what insurance the user provides. If it doesn't recognize what they entered, it defaults to Health.
            if (category.equalsIgnoreCase("Health")) {
                insurancePolicies[i] = new Health(description, cost);
            } else if (category.equalsIgnoreCase("Life")) {
                insurancePolicies[i] = new Life(description, cost);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting to Health insurance.");
                insurancePolicies[i] = new Health(description, cost);
            }
        }

        // Loops through the inputs then displays the information the user inputted with the category.
        for (Insurance policy : insurancePolicies) {
            policy.setInsuranceCost();
            JOptionPane.showMessageDialog(null, policy.displayInfo());
        }
    }
}