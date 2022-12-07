package com.java.class10;
import java.util.Scanner;
public class HWIfElseOct10th {
    public static void main(String[] args) {
//        Write a program to get 3 digit number from the user (Valid Numbers - 100 to 999 only) and print reverse of the given number in the output
//        Example
//        Input - 325
//        Output - 523

        Scanner sc = new Scanner(System.in);

//        Task #2: Write a program that reads power consumed in units and print the amount to be paid by the customer
//  Consumption   Rate of Units Charges are as follows
//  ------------------------------------------------------
//  If unit is 0-200       Rs.0.50 per unit
//  If unit is 201-400     Rs.100 plus Rs.0.65 per unit
//  If unit is 401-600     Rs.230 plus Rs.0.80 per unit
//  -------------------------------------------------------
        int unit;

        System.out.println("Please input your units");
        unit = sc.nextInt();

        if (unit >= 0 && unit <= 200) {
            System.out.println("Your final bill: " + (unit * .50));
        }

            if (unit >= 201 && unit <= 400) {
            System.out.println("Your final bill: " + (unit * .65) + 100);

        }

            if (unit >= 401 && unit <= 600) {
            System.out.println("Your final bill: " + (unit * .80) + 230);


        } else if (unit < 0 || unit > 600) {
            System.out.println("Enter number 0-600");


        }
    }
}







