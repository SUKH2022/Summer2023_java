import java.util.Scanner;
public class Main {
    //week 2
    static void example1(){
        //week 1
        System.out.println("Hello world!");
        Car car1=new Car();
        car1.make="Honda";
        car1.model="Accord";
        car1.color= "grey";
        System.out.println("Car 1 make is " + car1.make);
        System.out.println("Car 1 model is " + car1.model);
//                string formatting is done by
//                %
        // s: string
        // d: digit (any whole no.)
        // f: float (any decimal no.)
        System.out.println("Car 1 color is " + car1.color) ;
        // car1.doors=2;
        // System.out.println("Car 1 doors are " + car1.doors);
        car1.setKm(10000);
        System.out.println(car1.getKm());
        // data types are strict
//        a byte is not the same as int
//                short is not same as long
        byte door=4;
        car1.setDoors(door);
    }

    static void example2(){

//       get user input
//      Scanner object : package java.util.Scanner
        Scanner input =new Scanner(System.in);
//        alt + 7 for the window to open
        //ask a question
        //sout+tab
        System.out.println("Enter car color");
        String color= input.next();
        System.out.println("Enter the car make");
        String make=input.nextLine();
        input.nextLine();
        System.out.println("Enter car no. of doors");
        byte numOfDoors= input.nextByte();
        input.nextLine(); //consume the scanner delimiter (aka the nl char)
        System.out.println("Enter the Car model");
        String model =input.nextLine();
        System.out.println("Enter the a yr:");
        short yr=input.nextShort();
        System.out.println("Enter weight:");
        double weight=input.nextDouble();
        //if going to from the no.to no.
        //no need to consume the nl character
        //why? becnextNumberDataType > truncate \n
        System.out.println("#cylinder");
        short cylinder=input.nextShort();
        System.out.println("Enter the km");
        int km=input.nextInt();

        //
        byte seats=5;
        Car car=new Car(color, model, make, 100f, seats, numOfDoors,  yr,weight, 123456, km);
        Car defaltCar=new Car(); //using default constructor
        System.out.println("What is the km of car object? ");
        System.out.println(car.getKm());

        System.out.println("WhAT is the km of the default car? ");
        System.out.println(defaltCar.getKm());
        System.out.println("Thank you for the input!!..");

        //nxt line for the whole word"Hello world"
        //nxt word is hello it will break after the enter or space


    }
    static void example3(){

    }
    static void example4(){
        /*
        * Create an array of Car objects */
        //ask the user 3 times for Car values
        //then
        //output the color make model and price for the each car project
        Car[] cars=new Car[3];
        Scanner input=new Scanner(System.in);
        for (int i =0; i<cars.length; i++){
            System.out.println("Enter info for car #" +(i+1));
            //ask user for the color, make model, and price
            System.out.println("Enter car color");
            String color=input.nextLine();
            System.out.println("Enter the car make");
            String make =input.nextLine();
            System.out.println("Enter the model");

            //create an object at the specified index of the cars array
        }
    }
    void regularMethod(){}

    public static void main(String[] args) {
        example2();
//        Main main= new Main();
//        main.regularMethod();
//
//        new Main().regularMethod();
//
//        Main.example2();


//        week 1
//        System.out.println("Hello world!");
//        Car car1=new Car();
//        car1.make="Honda";
//        car1.model="Accord";
//        car1.color= "grey";
//        System.out.println("Car 1 make is " + car1.make);
//        System.out.println("Car 1 model is " + car1.model);
////                string formatting is done by
////                %
//                // s: string
//                // d: digit (any whole no.)
//                // f: float (any decimal no.)
//        System.out.println("Car 1 color is " + car1.color) ;
//       // car1.doors=2;
//       // System.out.println("Car 1 doors are " + car1.doors);
//        car1.setKm(10000);
//        System.out.println(car1.getKm());
//        // data types are strict
////        a byte is not the same as int
////                short is not same as long
//         byte door=4;
//         car1.setDoors(door);
    }
}
//    Hello world!