package com.java.class34;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.Arrays;

public class TestApple {
    public static void main(String[] args) {
        BaseIphone deviceId1 = new BaseIphone("Iphone7", 512, "Black", "16.0");
        BaseIphone deviceId2 = new BaseIphone("Iphone8", 256, "Silver", "14.0");
        BaseIphone deviceId3 = new BaseIphone("Iphone10", 156, "matte", "15.0");
        BaseIphone deviceId4 = new BaseIphone("Iphone8", 156, "Matte", "15.0");

        deviceId2.setiOSVersion("16.0");
        System.out.println(deviceId1.getiOSVersion());


        BaseIphone[] allIphones = new BaseIphone[4];
        allIphones[0] = deviceId1;
        allIphones[1] = deviceId2;
        allIphones[2] = deviceId3;
        allIphones[3] = deviceId4;

        updateIOS(allIphones);
        System.out.println((allIphones));

    }
// Create a static method that takes an array of all types of iphones and finds all iphone that are
    public static String whichIphone (BaseIphone baseIphone) {
        return baseIphone.getModel();
        }
public static void updateIOS(BaseIphone [] baseIphones){
for(int i = 0; i < baseIphones.length; i++){
    if(!baseIphones[i].getiOSVersion().equals("16.0")){
        baseIphones[i].setiOSVersion("16.0");
            }
        }
    }
}

