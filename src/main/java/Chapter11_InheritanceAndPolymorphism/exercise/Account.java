package Chapter11_InheritanceAndPolymorphism.exercise;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;


    Account() {
        this(0, 0);
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(String george, int i, int i1) {
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Methods
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated() + "\nBalance: $" + String.format("%.2f", balance) +
                "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
    }

    public String getName() {
        return null;
    }

    public InsnList getTransactions() {
        return null;
    }
}
