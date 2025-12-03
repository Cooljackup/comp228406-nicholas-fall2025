// COMP228-406 - Lab 6 - Nicholas Bonneville
// Lab 6 - Exercise 1

// Write a Java application that handles multiple ATM transactions (withdraw, deposit) at the same time.

package exercise1;

// Import necessary packages.
import java.util.Random;

public class Transaction implements Runnable {

    // Instance variables.
    public Account account;
    public double amount;
    public String transactionType;

    // Transaction constructor.
    public Transaction(Account account, double amount, String transactionType) {
        this.account = account;
        this.amount = amount;
        this.transactionType = transactionType.toLowerCase();
    }

    // The run method. Does either a deposit or a withdrawal depending on the transaction type.
    public void run() {
        if (transactionType.equals("deposit")) {
            account.Deposit(amount);
        } else if (transactionType.equals("withdraw")) {
            account.Withdraw(amount);
        }

        // Added to simulate processing time.
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException event) {
            event.printStackTrace();
        }
    }
}