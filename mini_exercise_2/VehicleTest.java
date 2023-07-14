public class VehicleTest {
    public static void main(String args[]) {
//        Runner class
        // three variables
        Vehicle vehicle1 = new Vehicle("red", 2, false);
        Vehicle vehicle2 = new Vehicle("blue", 5, true);
        Vehicle vehicle3 = new Vehicle("green", 7, true);

//        output
        System.out.println("The color, number of doors, and if vehicle 1 is gas powered: " + vehicle1.getColor() + ", " + vehicle1.getNumberOfDoors() + ", " + vehicle1.isGasPowered());
        System.out.println("The color of vehicle 2 is: " + vehicle2.getColor());
        System.out.println("The vehicle 3 is gas powered: " + vehicle3.isGasPowered());

    }
}
/*
* The color, number of doors, and if vehicle 1 is gas powered: red, 2, false
The color of vehicle 2 is: blue
The vehicle 3 is gas powered: true

Process finished with exit code 0
* */