package com.java.class13;
import java.util.Scanner;
public class HwMethodOct17th {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        dottedLine();
//
//        System.out.println("Enter Temperature in celsius");
//        double tempCelsius = sc.nextDouble();
//
//        dottedLine();
//
//        System.out.println("Temperature in Fahrenheit is: ");
//        System.out.println((convert(tempCelsius)));
//
//        dottedLine();
//
//    }
//
//    static double convert(double tempCelsius) {
//        double fraction = 1.8;
//        double formula = ((tempCelsius * fraction) + 32);
//        return formula;
//
//    }
//
//    static void dottedLine (){
//        System.out.println("--------------------------------");
        equalsLine();

        System.out.println("Please input your first number: ");
        int num1 = sc.nextInt();

        equalsLine();

        System.out.println("Please input your second number: ");
        int num2 = sc.nextInt();

        equalsLine();

        System.out.println("Please input your third number: ");
        int num3 = sc.nextInt();

        equalsLine();

        System.out.println("Please input your fourth number: ");
        int num4 = sc.nextInt();

        equalsLine();

        int greatest= findingGreatestNum(num1,num2,num3,num4);

        System.out.println("The greatest number of the 4 is: " + greatest);

        equalsLine();

    }

    static int findingGreatestNum(int num1, int num2, int num3, int num4) {


        if (num1 > num2 && num1 > num3 && num1 > num4) {
            return  num1;

        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            return num2;

        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            return num3;

        } else {
            return num4;

            }

        }
      static  void equalsLine (){
        System.out.println("=============================");
        }
    }

