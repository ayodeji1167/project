package com.deestech;
public class Grading {
    private String name;
    private double average;

    public Grading(String name, double average){
        this.name = name;
        if(average > 0.0)
            if (average <= 100.0)
        this.average = average;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAverage(double average){
        if (average > 0.0)
            if (average <= 100)
        this.average = average;

    }


    public double getAverage() {
        return average;
    }
    public String getLetterGrade(){
        String letterGrade = "";
        if (average >= 90.0)
            letterGrade = "A";
        else
            if(average >= 80.0)
                letterGrade = "B";
        else
            if(average >= 70.0)
                letterGrade = "C";
        else
                letterGrade = "Failed";

        return letterGrade;
    }
}
