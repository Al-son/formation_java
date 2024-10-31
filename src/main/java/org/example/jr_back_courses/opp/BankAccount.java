package org.example.jr_back_courses.opp;

public class BankAccount {
    // Encapsulation
    private double sold;

    public BankAccount(double amount) {
        this.sold = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            sold += amount;
        }
    }

    public void remove(double amount) {
        if (amount > 0 && amount <= 0) {
            sold -= amount;
        }
    }

    public double getSold() {
        return sold;
    }

}
