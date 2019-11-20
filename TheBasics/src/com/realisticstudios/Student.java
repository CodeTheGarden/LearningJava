package com.realisticstudios;

import java.util.Scanner;

public class Student {

    //properties
    private String name;
    private float gradePointAverage;
    private float[] grades;


    //methods
    //setters
    public void setGrades(float[] grades) {
        this.grades = grades;
        setGradePointAverage();
    }
    public void setName(String name) {
        this.name = name;
    }
    private void setGradePointAverage() {
        float sum = 0.0F;
        for (int i =0; i < grades.length; i++){
            sum += grades[i];
        }
        gradePointAverage = sum/grades.length;

    }

    //getters
    public float getGradePointAverage() {
        return gradePointAverage;
    }
    public String getName() {
        return name;
    }

    //utility functions
    public void inputGrades(Scanner scanner){
        System.out.print("How many courses did this student take?");
        int numberOfCourses = scanner.nextInt(); //no magic numbers
        float[] courseGrades = new float[numberOfCourses];

        for(int i = 0; i < numberOfCourses; i++){
            System.out.print("Grade for course #" + (i + 1) + ": ");
            courseGrades[i] = scanner.nextFloat();
        }
        setGrades(courseGrades);
    }
    public String studentInfo(){
        return "Student Name: " + getName() + " GPA: " + getGradePointAverage();
    }
}

