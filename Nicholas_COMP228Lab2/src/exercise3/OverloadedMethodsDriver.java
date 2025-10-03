// COMP228-406 - Lab 2 - Nicholas Bonneville
// Lab 2 - Exercise 3

// Write a Java application that implements a set of three overloaded static methods.

package exercise3;

// Import necessary packages.
import javax.swing.*;

public class OverloadedMethodsDriver {
    public static void main(String[] args) {

        // Instance variables.
        int intResult = OverloadedMethods.overloadedSum(20, 30);
        double doubleResult = OverloadedMethods.overloadedSum(15.5, 9.5);
        String stringResult = OverloadedMethods.overloadedSum("Nicholas", "Bonneville");

        // Displays all of the results.
        JOptionPane.showMessageDialog(null, "Overloaded Methods:" + "\n\n2 ints added: 20 + 30 = " + intResult + "\n2 doubles added: 15.5 + 9.5 = " + doubleResult + "\n2 Strings added: Nicholas + Bonneville = " + stringResult);
    }
}