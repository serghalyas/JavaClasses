package GroupProject;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


//            /**
//             * We have a customer who was born on a leap date (04.28.1950). In 2010 she turned 60,
//             * but officially she is 15 years old, since there were only 15 leap years between 1950 and 2010.
//             *
//             * Write a program that takes two years and counts the number of leap years between two years
//             *
//             * Example output:
//             * Enter first year: 1950
//             * Enter second year: 2010
//             *
//             * Number of leap years: 15
//             *
//             */

        Scanner sc = new Scanner(System.in);

        int startYear;
        int endYear;

        System.out.println("Enter first year:");
        startYear = sc.nextInt();

        System.out.println("Enter second year:");
        endYear = sc.nextInt();

        countLeapYearsBetweenYears(startYear, endYear);


        // TODO WRITE YOUR CODE HERE

    }

    public static int countLeapYearsBetweenYears(int startYear, int endYear) {

        int num = 0;
        for (startYear =startYear; startYear<=endYear; startYear++ )
            if (startYear%4==0){

                num++;
            }
        System.out.println("Number of leap years: " + num);
        return -1;
            }


        }

