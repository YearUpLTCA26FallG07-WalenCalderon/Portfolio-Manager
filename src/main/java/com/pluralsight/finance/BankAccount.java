package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable {
    private final int accountNumber;
    private final String name;
    private BigDecimal balance;

    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void withdraw(double amount) {
        balance = balance.subtract(BigDecimal.valueOf(amount));
    }

    @Override
    public double getValue() {
        return balance.doubleValue();
    }
}
