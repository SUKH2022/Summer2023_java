package com.computerhardware;

// abstract named keyboard in the package
public abstract class Keyboard {
    // two instance variables and a constructor in the abstract cls
    protected int keys;
    protected String type;
    public Keyboard(int keys, String type) {
        this.keys = keys;
        this.type = type;
    }

    // concrete method and an abstract method in the keyboard cls
    public String getType() {
        return type;
    }
    public abstract void type(char character);
}