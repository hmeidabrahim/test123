package com.bank;

import java.time.LocalDate;

public class Transaction {

    public Transaction(LocalDate date, int amount, int balance) {
        this.date = date;
        this.balance = balance;
        this.amount = amount;
    }

    private LocalDate date;
    private int balance;
    private int amount;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
