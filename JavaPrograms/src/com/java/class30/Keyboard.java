package com.java.class30;

public class Keyboard {

    String brand, sizeOfKeyboard, switches, plateMaterial; //Instance Variable

    Keyboard(){} // No Parameter


    Keyboard(String brand,String sizeOfKeyboard,String switches, String plateMaterial){ // Parameter

        this.brand = brand;
        this.sizeOfKeyboard = sizeOfKeyboard;
        this.switches = switches;
        this.plateMaterial = plateMaterial;
    }
}

class KeyCult extends Keyboard {
    KeyCult () {


    }
}
class GeonWorks extends Keyboard {
    GeonWorks(){

    }
}
class GreasedAndFilmedSwitches {
    int price;

}