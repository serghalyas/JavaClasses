package com.java.class18;

import java.util.Scanner;

public class PatternJavaHW {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//      for ( int row = 1; row <= 5; row++) {
//        for (int column = 1; column <= 5 - row + 1  ; column++) {
//
//            int value = 5 - column +1;
//            System.out.print(value);
//
//        }
//        System.out.println();
//
//            }


//        for ( int row = 1; row <= 5; row++) {
//            for (int spc = 0; spc <= row; spc++)
//                System.out.print(" ");
//
//
//            for (int column = 1; column <= (5 - row + 1) *2 -1  ; column++) {
//
//                int value = column;
//                System.out.print(value);
//
//
//            }
//            System.out.println();
//
//
//        }

//        for (int row = 1; row <= 5; row++) {
//            for (int spc = 1; spc <= row ; spc++)
//                System.out.print(" ");
//
//
//            for (int column = 1; column <= (5 - row + 1) * 2 - 1; column++) {
//
//                int value = column;
//                System.out.print(value);
//
//
//            }
//            System.out.println();
//        }

//        for (int row = 1; row <= 5; row++) {
//            for (int spc = 5; spc >= row; spc--)
//                System.out.print(" ");
//
//
//            for (int column = 1; column <= row  * 2 - 1; column++) {
//
//                int value = column;
//                System.out.print(value);
//
//
//            }
//            System.out.println();
//        }
//        for (int row = 2; row <= 5; row++) {
//            for (int spc = 1; spc <= row ; spc++)
//                System.out.print(" ");
//
//
//            for (int column = 1; column <= (5 - row + 1) * 2 - 1; column++) {
//
//                int value = column;
//                System.out.print(value);
//
//
//            }
//            System.out.println();
//        }


//        for (int row = 1; row <= 5; row++) {
//            for (int spc = 5; spc >= row; spc--)
//                System.out.print(" ");
//
//
//            for (int column = 1; column <= row * 2 - 1; column++) {
//
//                int value = column;
//                System.out.print(value);
//
//
//            }
//            System.out.println();
//        }
//        for (int row = 2; row <= 5; row++) {
//            for (int spc = 1; spc <= row; spc++)
//                System.out.print(" ");
//
//            for (int column = 1; column <= (5 - row + 1) * 2 - 1; column++) {
//
//                if (row % 2 == 0) {
//                    System.out.println("1");
//                } else {
//                    System.out.println("0");
//                }
//            }
//        }


//        Write a program to print all the prime numbers from 1 to 100

//        int divisor = 0;
//        for ( int i = 1; i <= 100; i++ ){
//            divisor = 0;
//            for (int q = 1; q <= 100; ++q ) {
//                if (i % q == 0)
//                    divisor++;
//                }
//                if ( divisor == 2) {
//                    System.out.println(i);
//                }
//
//                }

//        Write a program to find a magic number from 1 to 100,
//        if you divide that number by 5 you will get remainder 4
//        if you divide that number by 4 you will get remainder 3
//        if you divide that number by 3 you will get remainder 2
//        if you divide that number by 2 you will get remainder 1

        for ( int i = 1; i <= 100; i++) {
            if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1){
                System.out.println("Magic number is: " + i);
            }
        }


            }

        }


