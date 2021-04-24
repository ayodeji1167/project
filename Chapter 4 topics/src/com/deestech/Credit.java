package com.deestech;

import java.util.Scanner;

public class Credit {

    public static void main(String... args){

        Scanner input = new Scanner(System.in);
        int accountNumber = 0;
        int beginningBalance = 0;
        int itemsCharged = 0;
        int creditApplied = 0;
        int allowedCreditLimit = 0;
        System.out.println("Enter credit limit or -1 to end the app: ");
       allowedCreditLimit = input.nextInt();

        while(allowedCreditLimit != -1)
        {

            System.out.println("Enter account number:");
            accountNumber = input.nextInt();

            System.out.println("Enter balance at the beginning of the month: ");
            beginningBalance = input.nextInt();

            System.out.println("Enter items Charged: ");
            itemsCharged = input.nextInt();

            System.out.println("Enter credit applied: ");
            creditApplied = input.nextInt();

            int newBalance = beginningBalance + itemsCharged - creditApplied ;
            System.out.println("New balance is: " + newBalance);

            if (allowedCreditLimit < newBalance)
                System.out.println("Credit limit exceeded");

            System.out.println("Enter another customer credit limit");
            allowedCreditLimit = input.nextInt();



        }




    }
}
