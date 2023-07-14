package com.computerhardware;

//an interfaced named button
public interface Button {
    // two constant values in the button cls
    int STANDARD_WIDTH = 45;
    int STANDARD_HEIGHT = 25;

    // two methods in the button cls
    void press();
    void release();
}