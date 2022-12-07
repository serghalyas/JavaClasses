package com.java.class22;
import java.util.Scanner;
public class HwNov7th {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        1. Write a program to find the sum of even and odd numbers
//        Example
//        Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//        Output : Sum Of Even - 134, Sum Of Odd - 206


//        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
//        int evenCount = 0;
//        int oddCount = 0;
//
//
//            for (int i = 0; i < data.length; i++) {
//                if (data[i] % 2 == 0) {
//                    evenCount = evenCount + data[i];
//            }else{
//                    oddCount = oddCount + data[i];
//                }
//            }
//
//            System.out.println(evenCount);
//            System.out.println(oddCount);
//    }
//}

//  2. Write a program to find greatest number from an array
//          Example
//          Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//          Output : Maximum - 75

//        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
//        int maxNum = data[0];
//
//        for (int i = 0; i < data.length; i++) {
//            if (maxNum < data[i] ){
//                maxNum = data[i];
//            }
//        }
//    System.out.println(maxNum);
//    }
//}
//        3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorming before solving)
//        Example
//        Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
//        Output : Duplicate numbers - 23, 44

        int data [] = {23, 44, 21, 23, 27, 35, 75, 44, 25};

        for(int i = 0; i < data.length; i++){
            for (int j = i + 1; j < data.length; j++) {
                if (data[i]==data[j]){
                    System.out.println(data[j]);
                }
            }
        }


    }
}