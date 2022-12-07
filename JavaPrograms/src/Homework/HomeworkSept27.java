package Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeworkSept27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str1 = "Hello";
        str1 = sc.next();

        String str2 = "World", str3;
        str2 = sc.next();


        str3=str1;
        str2=str3;
        str1=str2;


        System.out.println(str1);
        System.out.println(str2);
    }
}
