package com.chapterThreeExercises;

public class Account {
    private String name;
    private double balance;
    private double deposit;
    private double withdraw;

    public void setAccount(String accountName) {
       name = accountName;
    }

    public String getAccount() {
        return name;
    }

    public void setBalance(double accountBalance) {
        balance = accountBalance;

    }

    public double getBalance() {
        return balance;
    }

    public void setDeposit(double depositAmount) {
        deposit = depositAmount;
    }

    public double getDeposit() {
         deposit =balance + deposit;
         return deposit;
    }

    public void setWithdraw(double amountWithdraw) {
        withdraw =amountWithdraw;
    }

    public double getWithdraw() {
        balance =  balance - withdraw;
        return balance;

    }
}
