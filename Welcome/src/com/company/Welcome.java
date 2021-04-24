package com.company;

import java.util.Scanner;

public class Welcome {

    public static void main(String... args){


       Scanner input = new Scanner(System.in);

       int x;
       int y;


        System.out.println("Enter x");
        x =input.nextInt();
        System.out.println("Enter y");
        y = input.nextInt();

        if(x == y)
            System.out.printf("%d == %d%n", x,y);

        if(x <= y)
            System.out.printf("%d <= %d", x,y);

    }
}