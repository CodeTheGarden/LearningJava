package com.realisticstudios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //createStudent("Raul", scanner);
        System.out.println("What is your name?");

        String name = scanner.nextLine();
        //branching
        if(name.equals("Raul")){
            System.out.println("Hey there! " + name);
        }else if (name.equals("Sally")){
            System.out.println(name + "! Get off of Raul's computer!!!!");
        }else{
            System.out.println("Who the hell are you user? D:");
        }
        scanner.close();

    }
    //turn this into a constructor to allow for multiple object construction
    public static void createStudent(String name, Scanner input){
        Student student00 = new Student();
        student00.setName(name);
        student00.inputGrades(input);
        System.out.println(student00.studentInfo());
    }


}