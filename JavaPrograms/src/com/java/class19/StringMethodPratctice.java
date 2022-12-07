package com.java.class19;

public class StringMethodPratctice {
    public static void main(String[] args) {

        String name = "Hello, World!";
        String name2 = "After Hello, World.. Gets crazy";

//       boolean result = name.equalsIgnoreCase("bro");
//       int result = name.length();
//        char result = name.charAt(0);
//       int result = name.indexOf("o");
//      String result = name.toUpperCase();

        int result = name.length();
        System.out.println(result);

        for (int i = 1; i <= 5; i++) {
            for( int spc = 1 ; spc <= i; spc++ )
                System.out.print(" ");

            for (int j = 1; j <=(5 - i + 1) * 2 - 1  ; j++) {
                int value = j;
                System.out.print(j);
            }
        System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for( int spc = 1 ; spc <= 5 -i +1  ; spc++ )
                System.out.print(" ");

            for (int j = 1; j <= i *2 -1 ; j++) {
                int value = j;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}