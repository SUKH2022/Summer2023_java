//(2).2 Create two additional instance variables with unique non-private accessibility levels and data
//        types to represent the following attributes of a truck
//        -seats
//        -trunk space

public class Truck extends Vehicle {
    protected int seats;
    protected double trunkSpace;

    // Create 8 constructors
    public Truck() {
        super();
    }

    public Truck (String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
    }
    public Truck(String color, int numberOfDoors, boolean gasPowered, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }
    public Truck(Vehicle vehicle, int seats) {
        super(vehicle.getColor(), vehicle.getNumberOfDoors(), vehicle.isGasPowered());
        this.seats = seats;
    }

    public Truck(Vehicle vehicle, double trunkSpace) {
        super(vehicle.getColor(), vehicle.getNumberOfDoors(), vehicle.isGasPowered());
        this.trunkSpace = trunkSpace;
    }

    public Truck(Vehicle vehicle, int seats, double trunkSpace) {
        super(vehicle.getColor(), vehicle.getNumberOfDoors(), vehicle.isGasPowered());
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

//    Override the toString method to summarize all instance variables of the class
    // toString method
    @Override
    public String toString() {
        return super.toString() + ", seats=" + seats + ", trunkSpace=" + trunkSpace;
    }

    // isEcoFriendly method
    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && (seats <= 2 && trunkSpace == 0);
    }
}