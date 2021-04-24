package com.deestech;

public class Accounts{

    private String name;
    private double balance;

    public Accounts(String name,double balance){

        this.name = name;

        if(balance > 0.0)
            this.balance = balance;
    }

}