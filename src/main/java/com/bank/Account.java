package com.bank;

import java.time.LocalDate;

public class Account {

    private int balance;



    private void putIntransaction(int amount) {
        Transaction transaction = new Transaction(LocalDate.now(), amount, this.balance);
        TransactionHistorical.addtransaction(transaction);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        putIntransaction(amount);
    }
    public void withdraw(int amount) {
        this.balance -=amount;
        putIntransaction(amount);
    }
}
