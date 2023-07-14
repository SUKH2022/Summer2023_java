//Create 3 instance variables with unique data types and unique accessibility levels to represent
//        the following attributes of a vehicle
//        -color
//        -number of doors
//        -gas powered
public class Vehicle {
    private String color;
    private int numberOfDoors;
    private boolean gasPowered;

    // four Constructors
    public Vehicle() {

    }
    public Vehicle(String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Vehicle{" + "color='" + color + '\'' + ", numberOfDoors=" + numberOfDoors + ", gasPowered=" + gasPowered + '}';
    }

    // isEcoFriendly method
    public boolean isEcoFriendly() {
        return numberOfDoors == 2 && !gasPowered;
    }
}