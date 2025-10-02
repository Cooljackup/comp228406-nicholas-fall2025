// COMP228-406 - Lab 2 - Nicholas Bonneville
// Lab 2 - Exercise 1

// Write a Java application that simulates a test.

package exercise1;

// Imports necessary packages.
import java.util.Random;
import javax.swing.*;

public class Test {

    // Instance variables.
    private final String[] questions = {
            "(HINT: Only type in the number of the correct answer!) \n\nQuestion 1. What is Java? \n\n1. A programming language. \n2. A web browser. \n3. A computer. \n4. A variable.",
            "Question 2. What is an IDE? \n\n1. A java library. \n2. A type of variable. \n3. A tool to write, compile and run programs. \n4. A class.",
            "Question 3. What symbol is used to end a statement in Java? \n\n1. . \n2. ; \n3. : \n4. ,",
            "Question 4. Which of the following is used for multi-line comments in Java? \n\n1. // \n2. /* */ \n3. <!-- --> \n4. ##",
            "Question 5. Which of the following IDEs can be used to write Java? \n\n1. Visual Studio Code. \n2. Eclipse. \n3. IntelliJ. \n4. All of the above."
    };
    private final int[] correctAnswers = {1, 3, 2, 2, 4};
    private int totalCorrectAnswers;
    private int totalIncorrectAnswers;
    private final Random random = new Random();

    // Method to simulate the questions.
    public int simulateQuestion(int index) {
        String input = JOptionPane.showInputDialog(null, questions[index], "Question: " + (index + 1), JOptionPane.QUESTION_MESSAGE);
        try {
            return Integer.parseInt(input);
        }
        catch (NumberFormatException exception) {
            return -1;
        }
    }

    // Method to check the answer.
    public void checkAnswer(int questionIndex, int userAnswer) {
        if (userAnswer == correctAnswers[questionIndex]) {
            totalCorrectAnswers++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        }
        else {
            totalIncorrectAnswers++;
            JOptionPane.showMessageDialog(null, generateMessage(false) + "\nThe correct answer is: " + correctAnswers[questionIndex] + ".");
        }
    }

    // Method to display a random message for the user.
    public String generateMessage(boolean correct) {
        int randomMessageIndex = random.nextInt(4);

        return switch (randomMessageIndex) {
            case 0 -> correct ? "Excellent!" : "No. Please try again.";
            case 1 -> correct ? "Good!" : "Wrong. Try once more.";
            case 2 -> correct ? "Keep up the good work!" : "Don't give up!";
            default -> correct ? "Nice work!" : "No. Keep trying.";
        };
    }

    // Method to interact with the user.
    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            int userAnswer = simulateQuestion(i);
            checkAnswer(i, userAnswer);
        }

        double totalPercentage = ((double) totalCorrectAnswers / questions.length * 100);
        JOptionPane.showMessageDialog(null,
                "Test Complete!\n\n" +
                        "Correct Answers: " + totalCorrectAnswers +
                        "\nIncorrect Answers: " + totalIncorrectAnswers +
                        "\nPercentage: " + totalPercentage + "%");
    }
}