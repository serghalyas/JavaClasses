package com.java.class28;

public class Drinks {

    Drinks(){
        System.out.println("Give me something to drink please");
    }
}
class alcoholicDrinks extends Drinks {
        alcoholicDrinks() {
        System.out.println("Old Fashion");
    }

}
class refreshingDrinks extends Drinks {
    refreshingDrinks(){
        System.out.println("Sprite");
    }
}
class sportsDrinks extends refreshingDrinks {
    sportsDrinks(){
        System.out.println("Gatorade");
    }
}
class ifPast5PM extends sportsDrinks {
    ifPast5PM(){
        System.out.println("Only water for you, its past 5");
    }
}