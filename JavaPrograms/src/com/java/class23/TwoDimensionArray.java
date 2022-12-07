package com.java.class23;

public class TwoDimensionArray {
    public static void main(String[] args) {
     //Declaration of 2D Array
        int data [][] ;

        //Declare and assign in one line
        int info [] [] = {{23,44,21}, {45,42,31},{73,14,0}};

        //Declaration and initialization of 2D Arrays
        int num [] []  = new int [3][3];

        //Find number of rows in the array
        System.out.println(num.length);

        //Find number of colum in a row
        System.out.println(num[0].length);

        //Print data at particular index
        System.out.println(num[1][1]);

        //Print all data from 2D array using index based for loop
        for (int i = 0; i < info.length; i ++ ){
            for( int j = 0; j < info[i].length; j++) {
                System.out.println(info[i][j]);
            }
        }

    }
}
