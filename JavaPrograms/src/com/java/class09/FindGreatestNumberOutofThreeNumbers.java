package com.java.class09;
import java.util.Scanner;
public class FindGreatestNumberOutofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Print greatest number out of three numbers using nested if else

//        System.out.println("Please input your first number ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Please input your second number ");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Please input your third number ");
//        int num3 = scanner.nextInt();
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("First number is the greatest "+ num1);
//            if (num2 > num3 && num2 > num1) {
//            System.out.println("Second number is the greatest "+ num2);
//
//            }else{
//                if (num3>num1 && num3>num2) {
//                    System.out.println("Third number is the greatest "+ num3 );
//
//
//
//
//
//                }
//
//            }
//
//        }
        System.out.println("Please input your first number ");
        int num1 = scanner.nextInt();

        System.out.println("Please input your second number ");
        int num2 = scanner.nextInt();

        System.out.println("Please input your third number ");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + "Is the greatest number");
            } else {
                if (num2 > num1) {
                    if (num2 > num3) {

                        System.out.println(num2 + "Is the greatest number");

                    } else {
                        System.out.println(num3 + "Is the greatest number");



                    }
                }
            }
        }
    }
}