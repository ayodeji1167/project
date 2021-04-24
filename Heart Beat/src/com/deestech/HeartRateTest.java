package com.deestech;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String... args){
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter first name: ");
//        String firstName = input.next();
//
//        System.out.print("Enter last name: ");
//        String lastName = input.next();
//
//        System.out.print("Enter year: ");
//        int year = input.nextInt();
//
//        System.out.print("Enter month: ");
//        int month = input.nextInt();
//
//        System.out.print("Enter day: ");
//        int day = input.nextInt();

//        System.out.print("Enter currentYear: ");
//        int currentYear = input.nextInt();

        HeartRate user1 = new HeartRate("paul", "john", 2000, 7, 22);
        System.out.print(user1.getFirstName() );
        System.out.print(" ");
        System.out.println(user1.getLastName());

        System.out.println("age: " + user1.getAge() );
        System.out.println("Max heart rate: " + user1.maxHeartRate());
        System.out.println("target heart rate: "+ user1.targetHeartRate());

    }

}
