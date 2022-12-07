package com.java.class15;

public class printNumbersFrom1to5 {
    public static void main(String[] args) {


        for (int i = 1 , j = 10 ; i <= 5 ; i++ , j-- ){

            System.out.println(i);
            System.out.println(j);
        }
//Another approach

        System.out.println("========================");
        for (int i = 1; i <= 5; i ++ ){
            System.out.println(i);
            System.out.println(11-i);


        }

    }

}
