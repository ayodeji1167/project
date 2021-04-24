package com.deestech;

public class DateTest {

    public static void main(String...args){
        Date day1 = new Date(2, 4, 2021);
        System.out.printf("%d" +
                "" +
                "" +
                " \\ %d \\ %d", day1.getDay() , day1.getMonth(), day1.getYear() );

    }
}
