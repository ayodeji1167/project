package com.deestech;

import java.util.Scanner;

public class AccountddTest {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            Accountdd account1 = new Accountdd("deji" , 23.00);
            Accountdd account2 = new Accountdd("bolu" , -22.00);

            System.out.printf(account1.getName(), account1.getBalance());
        }


}
