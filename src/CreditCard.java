import java.util.Scanner;

public class CreditCard {

    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("The initial amount cannot be less than 0");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("The amount to be deposited must be positive ");
        }
    }


    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("There are not enough money in the account ");
        } else {
            System.out.println("The amount to be withdrawn must be positive.");
        }
    }

    public void printInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: " + balance);
    }
}