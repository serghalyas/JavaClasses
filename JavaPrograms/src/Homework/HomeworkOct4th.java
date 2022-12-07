package Homework;
import java.util.Scanner;
public class HomeworkOct4th {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//Task #1
//Task#1 : Write a program to take number from user and print if it's divisible by 5 or not

//
//        int input;
//        System.out.println("Please input the number: ");
//        input = sc.nextInt();
//
//            //checking if the remainder is 0 or not
//         if (input%5==0) {
//             System.out.println("Your number is divisible by 5");
//
//         }else{
//             System.out.println("The number you have entered is not divisible by 5");
//
//
//         }
        // ---------------------------------------------------------------------------------------------- >
//Task #2
//        Write a program to calculate the final bill of the customer after giving an appropriate discount based on the amount as follow
//        If total amount equal or above 10000 then give 20% discount
//        If total amount equal or above 5000 then give 15% discount
//        If total amount equal of above 2000 then given 10% discount
//        If total amount equal of above 1000 then given 5% discount
//        If total amount less than 1000 then 0% discount


//                System.out.println("Please enter the final bill amount");
//        double finalBill = sc.nextDouble();
//
//        double disocunt20 =(10000 - finalBill * 0.2);
//        double discount15 = (5000 - finalBill * 0.15);
//        double discount10 = (2000 - finalBill * 0.1);
//        double discount5 = (1000 - finalBill * 0.05);
//        double discount0;
//
//        if (finalBill >= 10000) {
//            System.out.println("Your discount appears to be 20%. Your bill: " + disocunt20);
//
//        }else if (finalBill>=5000) {
//            System.out.println(" Your discount appears to be 15%. Your bill: " +discount15);
//
//        }else if (finalBill>=2000) {
//            System.out.println(" Your discount appears to be 10%. Your bill: " +discount10);
//
//        }else if (finalBill>=1000) {
//            System.out.println(" Your discount appears to be 5%. Your bill: " + discount5);
//
//        }else if (finalBill<1000) {
//            System.out.println("Your discount appears to be 0");
//
//        }else{
//            System.out.println("Please follow directions");
//        }

//   ---------------------------------------------------------------------------------------------------------
//        Task#3 - Write a program to print messages based on the rating of the company
//        For Example,
//        rating is 5 then print Very Good
//        rating is 4 then print Good
//        rating is 3 then print Average
//        rating is 2 then print Poor
//        rating is 1 then print Very Poor


//
//        System.out.println("Please rate our company (1-5)");
//        int cusRating= sc.nextInt();
//
//        if (cusRating > 5) {
//            System.out.println("Please enter a valid number");
//
//        }else if (cusRating<=0) {
//            System.out.println("Please enter a valid number");
//
//        }else if (cusRating==5) {
//            System.out.println("Very Good!");
//
//        }else if (cusRating==4) {
//            System.out.println("Good!");
//
//        }else if (cusRating==3) {
//            System.out.println("Average!");
//
//        }else if (cusRating==2) {
//            System.out.println("Poor!");
//
//        }else{
//            System.out.println("Very poor");
//
//        }

//        Task#4 - Write a program to check given character is a vowel or not
//        Vowel characters are - a, e, i, o, u
//        Please refer to the below link to check how to get char using scanner class in java
//                Get Character In Java Using Scanner.
//        Example
//        Input - c
//        Output - Not Vowel
//        Input - a
//        Output - Vowel


        System.out.println("please input a character");
        char input = sc.next().charAt(0);

        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println("vowel");


        }else{
            System.out.println("Capital sensitive, please make sure the letter you are entering is lower case");
            System.out.println("Your result: not a vowel");

        }
    }
}


