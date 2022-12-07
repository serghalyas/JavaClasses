package com.java.class34;

public class BaseIphone {

    //Parameters of a class
    private String model;
    private int memory;
    private String color;
    private String iOSVersion;


    private String notes;
    private String messages;

    public BaseIphone(String model, int memory, String color, String iOSVersion){
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.iOSVersion = iOSVersion;

    }

    public String writeAMessage(String message) {
        return message;
    }

    public String writeANote(String note) {
        return note;

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    // To String at the end of the class.

    @Override
    public String toString() {
        return "BaseIphone{" +
                "model='" + model + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", iOSVersion='" + iOSVersion + '\'' +
                '}';
    }
}
