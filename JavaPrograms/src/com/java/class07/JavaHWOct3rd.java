package com.java.class07;

import java.util.Scanner;

public class JavaHWOct3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //      1. Write a program to print a given number that is positive, negative, or zero

//
//        System.out.println("Please enter your number: ");
//        int putNum = sc.nextInt();
//
//        if (putNum < 0) {
//            System.out.println("Your # is negative");
//
//        }else if (putNum == 0) {
//            System.out.println("Your # is equal to 0");
//
//        }else{
//            System.out.println("Your # is positive");


        //      2. Write a program to print the number of days in a given month
        //Example1
        //input is 3
        //output is 31 days
        //Example2
        //Input is 2
        //output is 28 days


        System.out.println("Please input the number of the month you would like to know: ");
        int inPutNum = sc.nextInt();

        int month1 = 31;
        int month2 = 28;
        int month3 = 31;
        int month4 = 30;
        int month5 = 31;
        int month6 = 30;
        int month7 = 31;
        int month8 = 31;
        int month9 = 30;
        int month10 = 31;
        int month11 = 30;
        int month12 = 31;

        if (inPutNum <= 0) {
            System.out.println("The month you have entered does not exists, please try again");

        } else if (inPutNum == 1) {
            System.out.println("The month you have chosen has " + month1 + " days");

        } else if (inPutNum == 2) {
            System.out.println("The month you have chosen has " + month2 + " days");

        } else if (inPutNum == 3) {
            System.out.println("The month you have chosen has " + month3 + " days");

        } else if (inPutNum == 4) {
            System.out.println("The month you have chosen has " + month4 + " days");

        } else if (inPutNum == 5) {
            System.out.println("The month you have chosen has " + month5 + " days");

        } else if (inPutNum == 6) {
            System.out.println("The month you have chosen has " + month6 + " days");

        } else if (inPutNum == 7) {
            System.out.println("The month you have chosen has " + month7 + " days");

        } else if (inPutNum == 8) {
            System.out.println("The month you have chosen has " + month8 + " days");

        } else if (inPutNum == 9) {
            System.out.println("The month you have chosen has " + month9 + " days");

        } else if (inPutNum == 10) {
            System.out.println("The month you have chosen has " + month10 + " days");

        } else if (inPutNum == 11) {
            System.out.println("The month you have chosen has " + month11 + " days");

        } else if (inPutNum == 12) {
            System.out.println("The month you have chosen has " + month12 + " days");

        } else {
            System.out.println("Only 12 months in a year, Try again!");

            //3. Write a program to take marks from the user and print the grade as follow
            //Mark is between 90 to 100 then print A+
            //Mark is between 80 to 89 then print A
            //Mark is between 70 to 79 then print B+
            //Mark is between 60 to 69 then print B
            //Mark is between 50 to 59 then print C+
            //Mark is between 40 to 49 then print C
            //Mark is below 40 then print Fail


//        System.out.println("Please input your grade: ");
//        int input1 = sc.nextInt();
//
//        if (input1 < 0) {
//            System.out.println("Your grade cannot go below zero, Try again!");
//
//        }else if (input1 > 100){
//            System.out.println("You are not that smart");
//
//        }else if (input1 >= 90){
//            System.out.println("Your grade appears to be: A+");
//
//        }else if (input1 >= 80){
//            System.out.println("Your grade appears to be: A");
//
//        }else if (input1 >= 70){
//            System.out.println("Your grade appears to be: B+");
//
//        }else if (input1 >= 60){
//            System.out.println("Your grade appears to be: B");
//
//        }else if (input1 >= 50){
//            System.out.println("Your grade appears to be: C+");
//
//
//        }else if (input1 >= 40) {
//            System.out.println("Your grade appears to be: C");
//
//        }else if (input1 < 40) {
//            System.out.println("You have failed, Please retake the test!");
//
//
//
//        }else{
//            System.out.println("The information you are entering is invalid, please follow directions");
//
//
//
//        }
        }
    }
}