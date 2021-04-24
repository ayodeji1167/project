package com.deestech;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int salary = 200;
        double grossSales = 0;
        double commission= 0;
        double item1= 0;
        double item2= 0;
        double item3= 0;
        double item4= 0;
        double salesPersonEarnings= 0;
        int salesPersonCounter= 1;

        while (salesPersonCounter <= 1){
            System.out.println("Enter item1 price: ");
            item1 = input.nextDouble();
            System.out.println("Enter item2 price: ");
            item2 = input.nextDouble();
            System.out.println("Enter item3 price: ");
            item3 = input.nextDouble();
            System.out.println("Enter item4 price: ");
            item4 = input.nextDouble();

            grossSales = item1 + item2 + item3 + item4;
            commission =(double) 9/100 * grossSales;
            salesPersonEarnings = salary + commission;
            salesPersonCounter += 1;

            System.out.printf("Total gross sales of the  sales person is: %.2f%n " , grossSales);

            System.out.printf("Sales person commission on the items sold is: %.2f%n" , commission);

            System.out.printf("The sales person earnings is: %.2f%n " , salesPersonEarnings);
        }
    }
}
