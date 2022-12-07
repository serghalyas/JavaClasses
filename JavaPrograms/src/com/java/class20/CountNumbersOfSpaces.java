package com.java.class20;

public class CountNumbersOfSpaces {
    public static void main(String[] args) {


        String str1 = "Hello user, How are you? ";
        System.out.println(getNumberOfSpaces(str1));
    }
        static int getNumberOfSpaces(String str1){
        int count = 0;
            for(int i =0; i < str1.length(); i++){
                if(str1.charAt(i) ==' '){
                count ++;
            }
        }
    return count;
    }
}
