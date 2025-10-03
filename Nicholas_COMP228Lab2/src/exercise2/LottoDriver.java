// COMP228-406 - Lab 2 - Nicholas Bonneville
// Lab 2 - Exercise 2

// Design a Lotto class with one array instance variables to hold three random integer values (from 1 to 9).

package exercise2;

// Import necessary packages.
import javax.swing.*;

public class LottoDriver {
    public static void main(String[] args) {

        // Instance variables.
        int userInput = 0;
        boolean win = false;

        // Gets the input from the user.
        for (int userTries = 1; userTries <= 5; userTries++) {
            try {
                userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a number between 3 and 27."));
            }
            catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "ERROR. Invalid input. Please try again.");
            }

            // Starts the lotto and calculates random number.
            Lotto lotto = new Lotto();
            int[] numbersArray = lotto.getArray();
            int numbersSum = numbersArray[0] + numbersArray[1] + numbersArray[2];
            JOptionPane.showMessageDialog(null, "Attempt #" + userTries + ": \n\nCorrect answer: " + numbersSum + "\nYour answer: " + userInput);
            userInput = 0;

            // Checks to see if user guessed correctly within 5 attempts.
            if (numbersSum == userInput) {
                JOptionPane.showMessageDialog(null, "You guessed correctly! Congrats! You win!");
                win = true;
                break;
            }
        }

        // If the user does not guess correctly after 5 attempts, the user loses.
        if (!win) {
            JOptionPane.showMessageDialog(null, "You did not guess correctly. You lose.");
        }
    }
}