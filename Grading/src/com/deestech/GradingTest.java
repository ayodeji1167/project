package com.deestech;

public class GradingTest {

    public static void main(String[] args){

        Grading student1 = new Grading("paul" , 88);
        Grading student2 = new Grading("james" , 100);

        System.out.print(student1.getName() +  " " + student1.getLetterGrade() );

    }
}
