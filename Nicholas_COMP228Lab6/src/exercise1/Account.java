// COMP228-406 - Lab 6 - Nicholas Bonneville
// Lab 6 - Exercise 1

// Write a Java application that handles multiple ATM transactions (withdraw, deposit) at the same time.

package exercise1;

public class Account {

    // Instance variables.
    public String accountNumber;
    public double balance;

    // Account constructor.
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Synchronized method to do a deposit.
    public synchronized void Deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " has deposited $" + amount + ". The new account balance is: $" + balance + ".");
    }

    // Synchronized method to do a withdrawal. If there isn't enough money to withdraw, it throws an error saying there isn't enough funds.
    public synchronized void Withdraw(double amount) {
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " has withdrawn $" + amount + ". The new account balance is: $" + balance + ".");
    }

    // Getters for instance variables of class Account.
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
}