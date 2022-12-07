package Homework;

import java.util.Scanner;
public class HomeworkSept28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Task 1. Write a program to get a number from user and print square of given number.

//        System.out.println("Good Morning, please pick your favorite number and input it into the system ");
//        int favnum = sc.nextInt();
//
//
//        double sqrnum = (int)favnum * favnum;
//        System.out.println("The square root of your number appears to be"+" "+ sqrnum);



//Task 2. Write a program to get principle, rate of interest and number of years from the user and calculate simple interest
        //  Formula = Principal x Interest Rate x Number of years

//        System.out.println("Lets find out your interest, please input the principal:  ");
//        double princ = sc.nextDouble();
//
//        System.out.println("Please input your rate of interest: ");
//       double rate = sc.nextDouble();
//
//        System.out.println("Please input the number of years");
//        int numyears = sc.nextInt();
//
//        double result = princ*rate*numyears;
//        System.out.println("Your simple interest appears to be: "+ result);



//Task 3.  Write a program to take total bill amount and discount percentage from user and print value of final bill amount after discount


        System.out.println("What is your total bill amount? ");
            double totbill = sc.nextDouble();
        System.out.println("Please enter your discount: ");
            double discnt = sc.nextDouble();

            double value = (totbill*discnt);
            double finlbill = totbill - value;

                    System.out.println("Final bill appears to be"+ " " + "$"+finlbill);
        System.out.println("Dont forget to leave a tip");






    }
}
