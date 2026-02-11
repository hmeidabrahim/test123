package com.bank;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class StatementPrinter {
    private static final DateTimeFormatter DATE_FORMAT =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void print(List<Transaction> transactions) {
        System.out.println("DATE       | AMOUNT  | BALANCE");
        for (Transaction transaction : transactions) {
            System.out.println(format(transaction));
        }
    }

    private String format(Transaction transaction) {
        String amount = transaction.getAmount() >= 0
                ? "+" + transaction.getAmount()
                : String.valueOf(transaction.getAmount());

        return transaction.getDate().format(DATE_FORMAT)
                + " | "
                + amount
                + " | "
                + transaction.getBalance();
    }
}