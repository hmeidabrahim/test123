package com.bank;

import java.util.List;

public class StatementPrinter {

    public void print(List<Transaction> transactions) {
        System.out.println("DATE | AMOUNT | BALANCE");

        for (Transaction transaction : transactions) {
            System.out.println(this.format(transaction));
        }
    }

    private static String format(Transaction transaction) {
        return transaction.getDate()
                + " | "
                + transaction.getAmount()
                + " | "
                + transaction.getBalance();
    }
}
