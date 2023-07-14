public class Car {
    //color- string uppercase
    //number of doors
    //weight
    //model- str
    //no. of cylinder
    // make
    //yr
    //horse power engine
    //seats
    String color, model, make;
    private float hp;
    private byte seats, doors; //byte is the smallest unit
    private short yr; // +- 26 million
    private double weigh, price;
    private int km;

    public float getHp() {
        return hp;
    }

    public void setHp(float a) {
        hp=a;

    }

    public byte getSeats() {
        return seats;
    }

    public byte getDoors() {
        return doors;
    }
    public void setDoors(byte a) {
        doors=a;

    }

    public short getYr() {
        return yr;
    }

    public double getWeigh() {
        return weigh;
    }

    public double getPrice() {
        return price;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    //alt+insert
    //rt click > generate

    public Car(String color, String model, String make, float hp, byte seats, byte doors, short yr, double weigh, double price, int km) {
        this.color = color;
        this.model = model;
        this.make = make;
        this.hp = hp;
        this.seats = seats;
        this.doors = doors;
        this.yr = yr;
        this.weigh = weigh;
        this.price = price;
        this.km = km;
    }
    //alt +insert
    //rt click > genrate

    public Car(String color, String model, String make, double price){
        this.color=color;
        this.model=model;
        this.make=make;
        this.price=price;
    }
    public Car(String color,String make, String model) {
        this(color,model, make, 0);
    }
    public  Car(){}

//getters and setters
    /*
    in cs
    public in kilometers{
    get;
    set{this.kilometers=value ? value>1 : 0}
    }
    */

    //alt+insert
    //right- click=> generate
//    press shift or ctrl

    //localdate, local time, local date and time in java
}
