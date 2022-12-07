package com.java.class24;

public class HwNov10 {
    public static void main(String[] args) {


//        1. Write a program to find all duplicates number from the array (Implement this program to get unique numbers in the output)
//        Try to brainstorm and create a logic, use pen and paper to write down what you do and find the next step, You can also work in a group of 3 to 4 for the brainstorming
//        Example
//        Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//        Output : Duplicate numbers - 23, 44, 35
//
//        2. Write a program to print the sum of each COLUMN from a 2D array
//        Example
//        Array:
//        {23, 44, 21},
//        {45, 42, 31},
//        {73, 14, 0}
//        Output : Duplicate numbers - 141, 100 ,52

//        3. Program to sort the elements of an array in ascending order (Same from the previous homework)
//        Example
//        Input : 5, 2, 8, 7, 3, 6
//        Output : Duplicate numbers - 2, 3, 5, 6, 7, 8

        //TASK #1
//        Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//        Output : Duplicate numbers - 23, 44, 35


//        int info[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 32};
//
//
//        for (int i = 0; i < info.length - 1; i++) {
//
//            int duplicateCount = 0;
//            for (int j = i + 1; j < info.length; j++) {
//                if (info[i] == info[j]) {
//                    duplicateCount++;
//
//                }
//            }
//            if (duplicateCount == 1) {
//                System.out.print("Duplicate numbers:");
//                System.out.println(info[i] + "");
//
//            }
//        }

        //TASK #2:
//        Array:
//        {23, 44, 21},
//        {45, 42, 31},
//        {73, 14, 0}

//
//        int nums[][] = {{23, 44, 21}, {45, 42, 31}, {74, 14, 0}};
//
//
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < nums[i].length; j++) {
//                sum = sum + nums[i][j];
//            }
//
//            System.out.println(sum);
//
//        }
//    }
//}

//    3. Program to sort the elements of an array in ascending order (Same from the previous homework)
//        Example
//        Input : 5, 2, 8, 7, 3, 6
//        Output : Duplicate numbers - 2, 3, 5, 6, 7, 8


        // When sorting use a temp value

        int info[] = {5, 2, 8, 7, 3, 6};

        for (int i = 0; i < info.length; i++) {
            for (int j = i + 1; j < info.length; j++) {
                if (info[i] > info[j]) {
                    int temp = info[i];
                    info[i] = info[j];
                    info[j] = temp;
                }
            }
            System.out.println(info[i] + "");
        }
    }
}


