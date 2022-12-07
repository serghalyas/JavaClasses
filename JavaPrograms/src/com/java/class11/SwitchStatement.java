package com.java.class11;
import java.util.Scanner;
// Print given number in word (0-9)
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    System.out.println("Please enter number ");
//    int num = sc.nextInt();
//
//    switch(num){
//        case 0:
//            System.out.println("Zero");
//            break;
//
//        case 1:
//            System.out.println("One");
//            break;
//
//        case 2:
//            System.out.println("Two");
//            break;
//
//        case 3:
//            System.out.println("Three");
//            break;
//
//        case 4:
//            System.out.println("Four");
//            break;
//
//        case 5:
//            System.out.println("Five");
//            break;
//
//        default:
//            System.out.println("Please enter number 0-5");


//        System.out.println("Please enter the month");
//        int month = sc.nextInt();
//
//        switch (month) {
//
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//
//                System.out.println("31 days ");
//
//                break;
//
//            case 2:
//                System.out.println("28 days");
//                break;
//
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("30 days");
//                break;
//
//            default:
//                System.out.println("Please enter number 1-12");


        // draw backs of duplicate code
        // 1. Inconsistency of code
        // 2. Maintenance of code
        // 3. More memory
        // 4. Messy

        // In Class Assignment 2
        // Print given number in word ( 0-5 ) if else condition

//        System.out.println("Please input number ");
//        int num = sc.nextInt();
//
//        if(num ==0) {
//            System.out.println("zero");
//
//        }else if(num ==1){
//                System.out.println("one");
//        }else if(num ==2){
//            System.out.println("two");
//        }else if(num ==3){
//            System.out.println("three");
//        }else if(num ==4){
//            System.out.println("four");
//        }else if(num ==5){
//            System.out.println("five");
//
//        }else{
//            System.out.println("Enter number 0-5");
//
//        }

//
//        switch (num) {
//            case 0:
//                System.out.println("zero");
//                break;
//
//            default:
//                System.out.println("error");
//
//
//        }


        System.out.println("Please choose what operations you choose: Add, Sub, Mul, Div, Mod");
        String decisionMake = sc.next();

        System.out.println("Please input the first number");
        int num1 = sc.nextInt();
        System.out.println("Please input the second number");
        int num2 = sc.nextInt();

        switch(decisionMake.toLowerCase()){

            case "add":
            case "+":
                System.out.println(num1+num2);
                    break;
            case "mul":
            case "*":
                System.out.println(num1*num2);
                    break;
            case "div":
            case "/":
                System.out.println(num1/num2);
                    break;
            case "sub":
            case "-":
                System.out.println(num1-num2);
                    break;
            case "mod":
            case "%":
                System.out.println(num1%num2);
                    break;
            default:
                System.out.println("Follow directions");

        }
    }
}




