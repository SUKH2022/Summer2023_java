public class VehicleT {
    public static void main(String args[]) {
        // drive code
        // three variables
        Vehicle vehicle1 = new Vehicle("red", 4, false);
        Vehicle vehicle2 = new Vehicle("coal",10,true);
        Vehicle vehicle3 = new Vehicle("blue",6,false);


        System.out.println("The color, and if vehicle 1 is gas powered: " + vehicle1.getColor() + vehicle1.isGasPowered());

        System.out.println("The color of vehicle 2 is: " + vehicle2.getColor());

        System.out.println("The vehicle 3 is: " + vehicle3.isGasPowered());

    }
}
