package com.deestech;

import java.util.Scanner;

public class AccountTest {

    public static void main(){
        Scanner input = new Scanner (System.in);
        Account account1 = new Account ("bola");

        System.out.println(account1.getName());


        System.out.println("enter name");
        String theOruko = input.nextLine();
        account1.setName(theOruko);

        System.out.printf("the name is", account1.getName());

    }
}
