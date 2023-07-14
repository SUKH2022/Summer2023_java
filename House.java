public class House {
    // Instance variables
    private int numOfRoom;
    protected String color;
    double area;

    // Constructors
    public House() {
        //default one
    }

    public House(int numOfRoom) {
        this.numOfRoom= numOfRoom;
    }

    public House(String color) {
        this.color = color;
    }

    public House(double area) {
        this.area = area;
    }

    public House(int numOfRoom, String color) {
        this.numOfRoom= numOfRoom;
        this.color = color;
    }

    public House(int numOfRoom, double area) {
        this.numOfRoom = numOfRoom;
        this.area = area;
    }

    public House(String color, double area) {
        this.color = color;
        this.area = area;
    }

    public House(int numOfRoom, String color, double area) {
        this.numOfRoom = numOfRoom;
        this.color = color;
        this.area = area;
    }

    // Getters and setters
    public int getNumberOfRooms() {
        return numOfRoom;
    }

    public void setNumberOfRooms(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}