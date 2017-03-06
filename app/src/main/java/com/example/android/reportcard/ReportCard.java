package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by sca2511 on 11/29/2016.
 */

public class ReportCard {

    public static void main(String[] args){
        //creating arraylist of students
        ArrayList<Student> reportCard = new ArrayList<>();

        //adding students to reportCard
        reportCard.add(new Student("Caine", "A", 84, 70));
        reportCard.add(new Student("Kaji", "P", 20, 99));

        //test for getting converted letter grades for each student in arraylist
        for(int i = 0; i < reportCard.size(); i++){
            System.out.println(reportCard.get(i).getFirstName() + " "
                    + reportCard.get(i).getLastName() + "\n" + "English: "
                    + reportCard.get(i).getEngLetterGrade() + "\n"
                    + "Math: " + reportCard.get(i).getMathLetterGrade());
        }

    }



}

class Student{

    //local variables
    private String firstName;
    private String lastName;
    private String engLetterGrade;
    private String mathLetterGrade;
    private double englishGrade;
    private double mathGrade;

    //constructor
    public Student(String firstName, String lastName, double englishGrade, double mathGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;

        convertGrade();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", engLetterGrade='" + engLetterGrade + '\'' +
                ", mathLetterGrade='" + mathLetterGrade + '\'' +
                ", englishGrade=" + englishGrade +
                ", mathGrade=" + mathGrade +
                '}';
    }

    //convert double to letter grade
    public void convertGrade(){
        if(englishGrade < 0){
            englishGrade = 0;
            engLetterGrade = "F";
        }
        else if(englishGrade < 60)
            engLetterGrade = "F";
        else if(englishGrade < 70)
            engLetterGrade = "D";
        else if(englishGrade < 80)
            engLetterGrade = "C";
        else if(englishGrade < 90)
            engLetterGrade = "B";
        else
            engLetterGrade = "A";

        if(mathGrade < 0){
            mathGrade = 0;
            mathLetterGrade = "F";
        }
        else if(mathGrade < 60)
            mathLetterGrade = "F";
        else if(mathGrade < 70)

            mathLetterGrade = "D";
        else if(mathGrade < 80)
            mathLetterGrade = "C";
        else if(mathGrade < 90)
            mathLetterGrade = "B";
        else
            mathLetterGrade = "A";
    }

    //setters and getters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEngLetterGrade() {
        return engLetterGrade;
    }

    public void setEngLetterGrade(String engLetterGrade) {
        this.engLetterGrade = engLetterGrade;
    }

    public String getMathLetterGrade() {
        return mathLetterGrade;
    }

    public void setMathLetterGrade(String mathLetterGrade) {
        this.mathLetterGrade = mathLetterGrade;
    }
}