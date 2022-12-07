package com.java.class26;

public class Car {
    int speed;
    String color;
    String make;

    void drive (){
        System.out.println("Driving "+ color + " car at speed " + speed);

    }
    int increaseSpeed (int speed){
        speed = speed + 500;
        return  speed;

    }
void decreaseSpeed(Car myCar){
myCar.speed = myCar.speed - 200;
    }
void maxSpeedZero (){
        speed = 0;

}
}
