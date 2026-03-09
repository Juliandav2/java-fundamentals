package com.julian.fundamentals.Encapsulation;

public class BankAccount {

    private double balance;

    public double getBalance () {
        return balance;
    }

    public void deposit (double mount) {

        if (mount <= 0) {
            throw new IllegalArgumentException("The mount cannot be negative");
        }

        this.balance += mount;
    }
}
