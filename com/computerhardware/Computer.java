package com.computerhardware;

/*
a concrete cls named computer in the package
which is based on the abstract keyboard cls
it is also implements the button interface in it.
*/
public class Computer extends Keyboard implements Button {
    private final String system;
    private boolean isButtonPressed;

    public Computer(int keys, String type, String system) {
        super(keys, type);
        this.system = system;
        this.isButtonPressed = false;
    }

    @Override
    public void press() {
        if (!isButtonPressed) {
            System.out.println("Button pressed with width " + STANDARD_WIDTH + " and height " + STANDARD_HEIGHT + " on a " + system + " computer");
            isButtonPressed = true;
        } else {
            System.out.println("Button already pressed");
        }
    }

    @Override
    public void release() {
        if (isButtonPressed) {
            System.out.println("Button released");
            isButtonPressed = false;
        } else {
            System.out.println("Button not pressed");
        }
    }

    @Override
    public void type(char character) {
        System.out.println("Character " + character + " typed on a " + getType() + " keyboard.");
    }

//    code output testing
    public static void main(String[] args) {
        Computer computer = new Computer(104, "QWERTY", "Windows 10");
        computer.press();
        computer.release();
        computer.type('S');
    }
}
/*
   output_of_the_code:-
 * Button pressed with width 45 and height 25 on a Windows 10 computer
 * Button released
 * Character S typed on a QWERTY keyboard.
*/