public class Truck extends Vehicle{
    protected int seats;
    public double trunkSpace;

    public Truck() {
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace, String extraFeature) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
        // additional initialization for extraFeature
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

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", gasPowered=" + gasPowered +
                ", seats=" + seats +
                ", trunkSpace=" + trunkSpace +
                '}';
    }

    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && (seats <= 2 && trunkSpace == 0);
    }
}
