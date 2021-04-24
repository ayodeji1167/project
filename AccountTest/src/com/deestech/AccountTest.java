package com.deestech;

import java.util.Scanner;

public class AccountTest {

    public static void main(String... args){
        Scanner input = new Scanner (System.in);
        Account account1 = new Account("bola") ;

        Account account2 = new Account("lamidi");


        System.out.println(account1.getName());
        System.out.println(account2.getName());

        System.out.println("enter  your name");

        String yourName = input.next();

        account1.setName(yourName);

        System.out.printf("the name is %s%n" , account1.getName());


    }
}
