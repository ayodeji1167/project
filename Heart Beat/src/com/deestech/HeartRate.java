package com.deestech;

public class HeartRate {

private String firstName;
private String lastName;
private int year;
private int month;
private int day;
private int age;
private int currentYear = 2021;
private int maxHeartRate ;
private int targetHeartRate ;


public HeartRate(String firstName, String lastName, int year, int month, int day){
    this.firstName = firstName;
    this.lastName = lastName;
    this.year = year;
    this.month = month;
    this.day = day;
}
public void  setFirstName(String firstName){
    this.firstName = firstName;
}
public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getAge(){
     age = currentYear - year;
     return age;
    }

    public int maxHeartRate(){
    int maxHeartRate = 220 - age;

    return maxHeartRate;
    }

    public double targetHeartRate(){
    double targetHeartRate = 85/100f * 220f - age;
    return targetHeartRate;
    }

}
