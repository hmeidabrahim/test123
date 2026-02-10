package com.bank;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void should_deposit_money_on_account() {
        // Given
        Account account = new Account();

        // When
        account.deposit(100);

        // Then
        assertThat(account.getBalance()).isEqualTo(100);
    }

    @Test
    void should_withdraw_money_from_account() {
        // Given
        Account account = new Account();
        account.deposit(100);

        // When
        account.withdraw(30);

        // Then
        assertThat(account.getBalance()).isEqualTo(70);
    }
    @Test
    void all_cases(){
        // Given
        Account account = new Account();

        // When
        account.deposit(1000);    // amount=1000 (paramètre)
        account.withdraw(100);    // amount=100 (paramètre)
        account.deposit(500);     // amount=500 (paramètre)

        // Then

        assertThat(TransactionHistorical.transactions.size()).isEqualTo(3);

        StatementPrinter printer = new StatementPrinter();

        printer.print(TransactionHistorical.transactions);



    }
}