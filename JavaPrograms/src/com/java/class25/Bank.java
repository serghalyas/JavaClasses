package com.java.class25;

public class Bank {
    String accName;
    String accNumbers;
    double balance;
    int routingNum;
    char typeOfAccount;
    String currency;

    void deposit(int amount) {
        balance = balance + amount;

    }

    void withDraw(int amount) {
        balance = balance - amount;

    }

    void transferMoney(String accNumbers, double amount){
        System.out.println("Transferring " + amount + "to" + accNumbers);

    }
}