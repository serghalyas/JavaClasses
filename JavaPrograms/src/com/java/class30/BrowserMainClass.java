package com.java.class30;

import java.util.Scanner;

public class BrowserMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = sc.next();

        Browser b;

        if(browser.equalsIgnoreCase("chrome")) {
            Chrome c = new Chrome();
            c.openIncognitoWindow();
//            c.openAmazon();

        }else {

            FireFox f = new FireFox();
            f.openIncognitoWindow();
//            f.openAmazon();

        }
    }
}
