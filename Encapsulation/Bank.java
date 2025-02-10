package Encapsulation;

class BankAccount {

    // Private variables
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(initialBalance, 0); // Ensure the balance is not negative
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposite method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Tk diposited!");
        } else {
            System.out.println("Amount must be positive");
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 00 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Tk withdrawn");
            return true;
        } else {
            System.out.println("Insufficient or invalid amount");
            return false;
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account no. : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

public class Bank {
    // Main method for testing
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567", 500.0);
        account1.displayAccountInfo();
    }
}
