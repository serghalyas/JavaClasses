package com.java.class15;

import java.util.Scanner;

public class HwOct19th {
    public static void main(String[] args) {

//       //1. Java program to print the sum of even numbers from 1 to 10
//
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//
//            if (i % 2 == 0) {
//                sum = sum + i;
//
//            }}
//            System.out.println(sum);
//
//        }
//    }

        //2.  Java program to print the sum of 1 to 50 numbers which are divisible by 5 or by 3

//        int sum = 0;
//        for (int i = 1; i <= 50; i++) {
//
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum = sum + i;
//            }}
//        System.out.println(sum);
//    }
//}

//3. Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10


//        int result = 0;
//
//        for (int i = 1; i <= 10; i++) {
//
//            if (i % 3 == 0) {
//                result = result - i;
//            } else {
//                result = result + i;
//            }
//        }
//        System.out.println(result);
//    }
//}


//        Write a program to print each digit of the number into a separate line in reverse order

//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("Please input a number: ");
//        int input = sc.nextInt();
//
//        int reverse = 0;
//
//        int number;
//
//        while (input != 0) {
//
//            int remainder = input % 10;
//            reverse = reverse * 10 + remainder;
//            input = input / 10;
//
//        }
//        dottedLine();
//        System.out.println(reverse);
//
//    }
//
//    static void dottedLine() {
//        System.out.println("------------------");


        // Find Length of a given number
        // Input 3543346
        //Output - 7

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter a number ");
//        int i = sc.nextInt();
//        int count = 0;
//
//        while(i > 0){
//            i = i / 10;
//            count ++;
//        }
//
//
//         System.out.println(count);


        int largestNum = 0;

        int reverse = 0;

        System.out.println("Please enter a number ");
        int i = sc.nextInt();

        int max = i % 10;

        while (i != 0) {
            int remainder = i % 10;


            if (remainder > max ) {
                max = remainder;

            }

            i = i / 10;
        }

        System.out.println(max);
    }

}




