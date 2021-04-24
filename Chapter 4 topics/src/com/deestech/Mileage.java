package com.deestech;

import java.util.Scanner;

public class Mileage {

    public static void main(String... args){

        Scanner input = new Scanner(System.in);
        int mile = 0;
        int gallonUsed = 0;
        int totalMile = 0;
        int totalGallonUsed = 0;
        double milesPerGallon = 0;
        double totalMilesPerGallon = 0;

        System.out.println("Enter miles traveled or 0 to stop calculation: ");
        mile = input.nextInt();

        while ( mile != 0 ){
            System.out.println("Enter gallon used: ");
            gallonUsed = input.nextInt();

            totalMile += mile;


            milesPerGallon = (double) mile / gallonUsed;
            System.out.println("miles per gallon is:" + milesPerGallon);

            System.out.println("Enter miles traveled or 0 to stop calculation: ");
            mile = input.nextInt();

            totalGallonUsed += gallonUsed;

            totalMilesPerGallon += (double) milesPerGallon;

        }
        System.out.println("Total mile is: " + totalMile);
        System.out.println("Total gallon used is: " + totalGallonUsed);

        System.out.println("Total miles per gallon is: " + totalMilesPerGallon);

    }
}
