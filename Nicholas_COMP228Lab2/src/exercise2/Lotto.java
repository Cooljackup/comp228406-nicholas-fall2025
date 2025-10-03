// COMP228-406 - Lab 2 - Nicholas Bonneville
// Lab 2 - Exercise 2

// Design a Lotto class with one array instance variables to hold three random integer values (from 1 to 9).

package exercise2;

// Import necessary packages.
import java.util.Random;

public class Lotto {

    // Instance variables.
    private final int[] lottoNumbers = new int[3];

    // Constructor that randomly populates the array.
    public Lotto() {
        Random random = new Random();
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1;
        }
    }

    // Method to get array.
    public int[] getArray() {
        return lottoNumbers;
    }
}