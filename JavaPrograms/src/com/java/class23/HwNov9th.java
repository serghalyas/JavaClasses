package com.java.class23;

public class HwNov9th {
    public static void main(String[] args) {
//         Write a program to find all duplicates number from the array (Implement this program to get unique numbers in the output)
//        Example
//        Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//        Output : Duplicate numbers - 23, 44, 35

        int data []  = {23, 44, 21,23, 23, 35, 35, 23, 23, 44, 35};

        int duplicates[]  = new int [data.length];


        for( int i = 0; i < data.length; i++) {
            int duplicate = 0;
            for (int j = i + 1; j < data.length; j++) {

                if (data[i] == data[j]) {
                    duplicate++;
                    }
                }
            if(duplicate == 1) {
                System.out.println(data[i]);

                }
            }
        }
    }
//    Program to sort the elements of an array in ascending order (Tricky, do enough brainstorming before solving)
//Example
//        Input : 5, 2, 8, 7, 3, 6
//        Output : Duplicate numbers - 2, 3, 5, 6, 7, 8

//        int data [] = {5,2,8,7,3,6};
//        for( int i = 0; i < data.length; i++){
//            for (int j = i + 1  ; j < data.length; j++){
//                if(data[i] > data[j]) {
//                int temp = data[i];
//                data[i]=data[j];
//                data[j]=temp;
//                }
//            }
//        System.out.print(data[i]+" ");
//        }
//    }
//}