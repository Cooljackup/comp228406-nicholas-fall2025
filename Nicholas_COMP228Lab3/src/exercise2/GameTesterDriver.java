// COMP228-406 - Lab 3 - Nicholas Bonneville
// Lab 3 - Exercise 2

// Create a console application that demonstrates how to create objects of both classes.

package exercise2;

// Imports necessary packages.
import javax.swing.*;

public class GameTesterDriver {
    public static void main(String[] args) {

        // Instance variables.
        GameTester gameTester;
        String testersName;
        String testersType;
        double testersHours = 0;

        // Asks the user to input the Game Tester's name and if they are full time or part time.
        testersName = JOptionPane.showInputDialog("Please enter the Game Tester's Name:");
        testersType = JOptionPane.showInputDialog("Please enter if the Game Tester is full time or part time (E.g. Full, Part): ");

        // Checks to see what type of employment the user provides. If it doesn't recognize what they entered, it defaults to full time.
        if (testersType.equalsIgnoreCase("Full")) {
            gameTester = new FullTimeGameTester(testersName);
        } else if (testersType.equalsIgnoreCase("Part")) {
            try {
                testersHours = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Part Time Game Tester's hours:"));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting to 10 hours.");
                testersHours = 10;
            }
            gameTester = new PartTimeGameTester(testersName, testersHours);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR. An invalid input was provided. Defaulting to Full Time.");
            gameTester = new FullTimeGameTester(testersName);
        }

        // Displays the Game Testers information that was inputted.
        JOptionPane.showMessageDialog(null, gameTester.gameTesterInformation());

    }
}