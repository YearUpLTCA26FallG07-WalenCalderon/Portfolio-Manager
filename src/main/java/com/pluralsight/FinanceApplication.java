package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        BankAccount account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));
// try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);
    }

    //I forgot to implement BankAccount before starting the portfolio exercise. Deposits now work for both accounts.


}
