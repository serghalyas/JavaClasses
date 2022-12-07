package com.java.class34;

public class TouchIdIphones extends BaseIphone {
    public TouchIdIphones(String model, int memory, String color, String iOSVersion) {
        super(model, memory, color, iOSVersion);
    }

    String [] fingerprintData = {"text1", "text2", "text3"};

    public boolean touchID(String fingerprint) {
        boolean isUnlock = false;
        for (int i = 0; i < fingerprintData.length; i++) {
            if (fingerprint.equalsIgnoreCase(fingerprintData[i])) {
                isUnlock = true;
            }
        }
                return isUnlock;
            }
        }
