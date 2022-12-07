package com.java.class07;

import java.util.Scanner;

//write a program to print day name based on day of week
public class LadderIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any day of week (0-6): ");
         int daysOfWeek = sc.nextInt();

       if (daysOfWeek==0) {
            System.out.println("Sunday");
        }else if (daysOfWeek==1) {
            System.out.println("Monday");
        }else if (daysOfWeek==2) {
            System.out.println("Tuesday");
        }else if (daysOfWeek==3) {
            System.out.println("Wednesday");
        }else if (daysOfWeek==4) {
            System.out.println("Thursday");
        }else if (daysOfWeek==5) {
            System.out.println("Friday");
        }else if (daysOfWeek==6) {
            System.out.println("Saturday");

        }else {
                System.out.println("You have done something naughty");
                System.out.println("Please renter");
    }
}
    }