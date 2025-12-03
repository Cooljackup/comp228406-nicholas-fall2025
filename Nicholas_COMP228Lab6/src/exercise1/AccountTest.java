// COMP228-406 - Lab 6 - Nicholas Bonneville
// Lab 6 - Exercise 1

// Write a Java application that handles multiple ATM transactions (withdraw, deposit) at the same time.

package exercise1;

// Import necessary packages.
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {

    public static void main(String[] args) {

        // Creates an account.
        Account account1 = new Account("123", 500.0);

        // Creates a list of transactions.
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(account1, 150, "deposit"));
        transactions.add(new Transaction(account1, 100, "withdraw"));
        transactions.add(new Transaction(account1, 250, "deposit"));
        transactions.add(new Transaction(account1, 200, "withdraw"));
        transactions.add(new Transaction(account1, 350, "deposit"));
        transactions.add(new Transaction(account1, 300, "withdraw"));
        transactions.add(new Transaction(account1, 450, "deposit"));
        transactions.add(new Transaction(account1, 400, "withdraw"));
        transactions.add(new Transaction(account1, 550, "deposit"));
        transactions.add(new Transaction(account1, 500, "withdraw"));

        // Creates a fixed thread pool.
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Executes the transactions.
        for (Transaction t : transactions) { executor.execute(t); }

        // Shutdowns the executor.
        executor.shutdown();

        // Waits until all tasks are finished.
        while (!executor.isTerminated()) {}

        // After waiting, then prints out the final balance.
        System.out.println("\nThe final balance for account: " + account1.getAccountNumber() + ": $" + account1.getBalance());
    }
}