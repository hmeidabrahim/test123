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
}