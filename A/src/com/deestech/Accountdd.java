package com.deestech;
public class Accountdd{

    private String name;
    private double balance;

    public Accountdd(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance += depositAmount;
    }

    public void withdrawal(double withdrawnAmount) {
        if (withdrawnAmount > 0.0)
            balance -= withdrawnAmount;
    }

    public double getBalance() {
        return balance;
    }
}
