package com.deestech;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passed = 0;
        int failed = 0;
        int studentCounter = 1;



        while (studentCounter <= 10) {
            System.out.println("Enter score of the students");
            int score = input.nextInt();
            if (score == 1)
                passed += 1;
            else
                failed += 1;

            studentCounter += 1;

        }



        System.out.println("number of passed :" + passed + ", number of failed :" + failed);
        if (passed >= 8)
            System.out.println("Bonus to instructor");

    }
}