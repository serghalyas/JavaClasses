package Homework;

import java.util.Scanner;

public class HomeworkSept27part2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1,str2,str3;
        System.out.println("Please input your first word");
        str1 = sc.next();
        System.out.println("Please input your second word");
        str2 = sc.next();

        str3=str1;
        str1=str2;
        str2=str3;

        System.out.println(str1+" "+str2);



    }
}
