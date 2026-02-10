package com.bank;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistorical {

    static public List<Transaction> transactions = new ArrayList<>();

    static void addtransaction(Transaction transaction){
        transactions.add(transaction);
    }
}
