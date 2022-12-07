package com.java.class11;
import java.util.Scanner;
public class HwSwitchStatementOct12th {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Please input the number of day you'd like to know: ");
//    int dayInput = sc.nextInt();
//
//    switch(dayInput) {
//
//        case 0:
//            System.out.println("Sunday");
//            break;
//        case 1:
//            System.out.println("Monday");
//            break;
//        case 2:
//            System.out.println("Tuesday");
//            break;
//        case 3:
//            System.out.println("Wednesday");
//            break;
//        case 4:
//            System.out.println("Thursday");
//            break;
//        case 5:
//            System.out.println("Friday");
//            break;
//        case 6:
//            System.out.println("Sunday");
//
//        default:
//            System.out.println("Please enter a valid day of the week (0-6)");
//
//
//        }
        Scanner sc = new Scanner(System.in);





        int input;


        do {
            System.out.println("Please input a number");
            input = sc.nextInt();
        }
        while (input < 255);
        System.out.println();
        switch(input){
            case 0:
            case 1:
                System.out.println(input+50);
                break;
            default :
                System.out.println("Follow Directions!");

}
    }

    }

