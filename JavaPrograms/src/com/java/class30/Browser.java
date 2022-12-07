package com.java.class30;

class Browser {
    void openIncognitoWindow(){
        System.out.println("Control + T ");
    }
}

class Chrome extends Browser{
    void openIncognitoWindow() {
        System.out.println("Control + Shift + N ");
    }
}

class FireFox extends Browser{
    void openIncognitoWindow() {
        System.out.println("Cntrl + Shift + P");
    }
}
