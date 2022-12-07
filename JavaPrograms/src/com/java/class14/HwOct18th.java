package com.java.class14;

import java.util.Scanner;

public class HwOct18th {
    public static void main(String[] args) {
// 1. Write a program to print a table of 5
//        1 * 5  = 5
//        2 * 5  = 10
//        3 * 5  = 15
//        4 * 5  = 20
//        5 * 5  = 25
//        6 * 5  = 30
//        7 * 5  = 35
//        8 * 5  = 40
//        9 * 5  = 45
//        10 * 5 = 50

//        int changingNum = 1;
//        int num = 5;
//        int result = changingNum * num;
//
//
//
//        while (changingNum <= 10) {
//            System.out.println(changingNum + "*" + num + "=" + result);
//            changingNum++;
//
//        }

//        2. Write a program to print numbers from 1 to 20 which are divisible by 3

//        int num = 1;
//
//
//        while (num <= 20) {
//            if (num % 3 == 0) {
//                System.out.println(num);
//
//            }
//            num++;
//        }
//
//
//        }
//       3.  Write a Java program to Print Pattern 1 10 2 9 3 8 4 7 5 6

//        int num1 = 1;
//        int num2 = 10;
//
//        while (num1<=6 && num2 >=6){
//            System.out.println(num1);
//            num1++;
//            System.out.println(num2);
//            num2--;
//        }


        //Personal practice and research

        Scanner sc = new Scanner(System.in);


        int num1;
        do {
            System.out.println("please enter a # between 1-10: ");
             num1 = sc.nextInt();

        } while (num1 < 1 || num1 > 10);
        System.out.println(num1+ " Is between 1 and 10");
    }
}
