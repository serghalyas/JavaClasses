package GroupProject;

import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//* In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
//                * Calculate factorial and output result to the console.
//                * ex: 5! = 5 * 4 * 3 * 2 * 1
//                * Enter a number:
//                * 5
//                * Factorial result: 120
//                */

        System.out.println("Please enter a number ");
        int input = sc.nextInt();
        int var  = 0;
        for ( int i = input; i >= 1; i--){
            var = var * input;



             }
System.out.println(var);
        }



    }

