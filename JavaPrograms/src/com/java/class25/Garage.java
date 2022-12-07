package com.java.class25;

public class Garage {

// Car #1

String color = "Black";
String make = "BMW";
String model = "M5";
int year = 2003;
String transmission = "5 speed manual";
double horsePower = 394.00;
String engineSize = "V8";
boolean weekendCar = false;

void drive() {
    System.out.println("Put your " +transmission+" into first gear till you reach 3.5k RPM and next gear");

}

void drift (){
System.out.println("This bmw has" +transmission+" Drop a gear and disappear!" +" You have " + horsePower + " horsepower to have fun");

}


void isWeekendCar () {
    System.out.println(weekendCar + " Drift track ONLY");


}
}

