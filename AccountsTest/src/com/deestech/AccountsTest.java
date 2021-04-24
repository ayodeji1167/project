package com.deestech;

import java.util.Scanner;

public class AccountsTest {

    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        Accounts myAccounts = new Accounts("ayodeji",19.00);
        Accounts myAccounts1 = new Accounts("Adewale", 20.00);

        System.out.printf("%s balance: $%.2f%n", myAccounts1.getName(), myAccounts1.getBalance());

    }
}
