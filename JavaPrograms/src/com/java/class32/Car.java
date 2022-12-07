package com.java.class32;

 public class Car {

     private int speed;
     private String color;
     public int price;

     public Car() {
         System.out.println("From Car Constructor");
     }

     public int getSpeed() {
        return speed;
     }
    public void getSpeed (int speed){
         this.speed = speed;
    }
 }
