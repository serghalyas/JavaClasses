package com.java.class23;

public class ArrayResearch {
    public static void main(String[] args) {

        //Array = used to store multiple values in the same variable

//        String [] cars = {"Mercedes","BMW","Lexus","Audi"};
//
//        cars [1] = "AMG";
//
//        System.out.println(cars[1]);

//        String[] cars = new String[5];
//
//        cars[0] = "Mercedes";
//        cars[1] = "BMW";
//        cars[2] = "Lexus";
//        cars[3] = "Audi";
//
//
//        for (int i = 0; i < cars.length -1; i++) {
//            System.out.println(cars[i]);
//        }

        //2D Array = an array of arrays

        //PARKING GARAGE EXAMPLE


        // String cars [] = {"Camaro","Corvette","Mustang"},
        //                  {"Ferrari", "Bugatti", "McLaren"},
        //                  {"F250","F350","F150"}

        String [][] cars = new String [3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Mustang";

        cars[1][0] = "Ferrari";
        cars[1][1] = "Bugatti";
        cars[1][2] = "McLaren";

        cars[2][0] = "F250";
        cars[2][1] = "F350";
        cars[2][2] = "F150";

        for(int i = 0; i < cars.length; i++){
            for(int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }

            }



    }
}
