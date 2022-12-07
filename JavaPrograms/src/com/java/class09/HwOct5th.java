package com.java.class09;
import java.util.Scanner;
public class HwOct5th {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Task #1: Write a program to get a year from the user and check whether it's a leap year or not
//        Example
//        Input  : Year = 2000
//        Output : Leap year

//        System.out.println("Please input the year");
//        int years = scanner.nextInt();
//
//        if (years % 4 == 0) {
//            if (years % 400 == 0) {
//                System.out.println("Leap Year");
//
//            } else if (years % 100 == 0)
//                System.out.println("Not Leap year");
//
//            }else{
//                System.out.println("Not a leap year");
//
//
//            }
//        }
//    }

//        Task #2: Write a program to reads power consumed in units and print the amount to be paid by the customer
//        Consumption   Rate of Units Charges are as follows
//        ------------------------------------------------------
//                If unit is 0-200       Rs.0.50 per unit
//        If unit is 201-400     Rs.100 plus Rs.0.65 per unit
//        If unit is 401-600     Rs.230 plus Rs.0.80 per unit
//        -------------------------------------------------------
//
//        System.out.println("Please input your units: ");
//        int unit = scanner.nextInt();
//
//        if (unit >= 0 && unit <= 200) {
//            System.out.println("You need to pay" + " " + "$" + unit * .50);
//        } else if (unit >= 201 && unit <= 400) {
//            System.out.println("You need to pay" + " " + "$" + unit * .65);
//        } else if (unit >= 401 && unit <= 600) {
//            System.out.println("You need to pay" + " " + "$" + unit * .80);
//
//        } else {
//            System.out.println("The numbers you have entered are invalid");

//        }
//    }
//}
//        Task #3: Write a Program To Count Total Number Of Minimum Notes In Given Amount (Notes are of 1, 2, 5, 10, 20, 100 & 500)
//        Example
//        Input  : Amount = 255
//        Output : 2 Notes of 100
//        2 Notes of 20
//        1 Note of 10
//        1 Note of 5

        System.out.println("Please input a number so we can count the notes");
        int inPutNum = scanner.nextInt();


                if (inPutNum >= 500 || inPutNum < 500) {

                System.out.println(("Number of 500 notes: " + (inPutNum / 500)));

                inPutNum = inPutNum % 500;

                if (inPutNum >= 100 || inPutNum < 100) {

                System.out.println("Number of 100 notes: " + (inPutNum / 100));

                inPutNum = inPutNum % 100;

                if (inPutNum >= 20 || inPutNum <20) {

                    System.out.println(("Number of 20 notes: " + (inPutNum / 20)));

                    inPutNum = inPutNum % 20;

                }

                if (inPutNum >= 10 || inPutNum < 10) {

                    System.out.println(("Number of 10 notes: " + (inPutNum / 10)));

                    inPutNum = inPutNum % 10;

                }


                if (inPutNum >= 5 || inPutNum < 5) {

                    System.out.println(("Number of 5 notes: " + (inPutNum / 5)));

                    inPutNum = inPutNum % 5;

                }


                if (inPutNum >= 2 || inPutNum < 2) {

                    System.out.println(("Number of 2 notes: " + (inPutNum / 2)));

                    inPutNum = inPutNum % 2;

                }


                if (inPutNum >= 1 || inPutNum <1) {

                    System.out.println(("Number of 1 notes: " + (inPutNum / 1)));

                    inPutNum = inPutNum % 1;

                }

                    }else{

                    System.out.println("Please follow directions");
                }


                    }
                }
            }




