package com.java.class16;
import java.util.Scanner;
public class HwOct24th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Write a program to print sum of each digit from the given number
//        Input - 43634
//        Output - 20

//        System.out.println("Please input your number: ");
//        int input = sc.nextInt();
//
//        int lastNumber = 0;
//        int remainder = 0;
//        int sum = 0;
//
//        while ( input > 0 ) {
//            remainder = input % 10;
//            sum = sum + remainder;
//            input = input/10;
//        }
//        System.out.println(sum);

//        2.  Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5

//        int sum = 0;
//
//        for (int a = 10; a >= 6; a--) {
//            sum = sum + a;
//            System.out.println(a);
//
//        }
//
//            for (int b = 1; b <= 5; b++) {
//                sum = sum + b;
//                System.out.println(b);
//            }
//
//   System.out.println("The result: "+ sum);

//        3.  Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
        double result = 0;
        for(double a = 1 , b = 2; a <= 10 && b <= 11; a++, b++ ){
            result = result + a/b;

        }

        System.out.println(result) ;

//        4.  Write a program to find factors of the given number

//        Input - 6
//        Output - 1 2 3 6


            }

        }


