package com.bank;

public class Account {

    private int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        this.balance -=amount;
    }
}
