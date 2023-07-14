import java.util.Random;
import java.util.Scanner;

public class week3 {


    static void example1(){

        /*
        Ask the user to input a temperature.
        DETERMINE if the temperature is
            lt 0
                tell user to wear a winter coat
            bt 0-10
                tell user to wear a light coat
            bt 11-20
                tell user to wear a long-sleeve t-shirt
            gt 21
                tell user to wear short sleeve
            We need 3 variables
                Scanner: take user input
                double/float: get temperature value
                String: store whatToWear


         */
        Scanner input = new Scanner(System.in);
        double temperature = 0;
        String whatToWear = "short sleeve";
        System.out.println("Enter a temperature");
        temperature = input.nextDouble();

        if(temperature < 0)
            whatToWear = "Winter Coat";
        else if(temperature < 11)
            whatToWear = "light coat";
        else if(temperature <= 20)
            whatToWear = "long-sleeve";
//        else
//            whatToWear = "short sleeve";

        System.out.println(whatToWear);
    }

    static void example2(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a season");
        String season = input.nextLine();
        String whatToWear = "";
        switch (season.toLowerCase()){
            case "spring":
                whatToWear = "long sleeve";
                break;
            case "winter":
                whatToWear = "winter coat";
                break;
            case "fall":
                whatToWear = "light coat";
                break;
            default:
                whatToWear = "t-shirt";
                break;
        }

        System.out.printf("In %s, you should wear a %s%n",
                season, whatToWear);

    }
    static void example3(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a season");
        String season = input.nextLine();
        String whatToWear = switch (season.toLowerCase()){
            case "spring":
                yield  "long sleeve";
            case "winter":
                yield  "winter coat";
            case "fall":
                yield  "light coat";
            default:
                yield  "t-shirt";
        };

        System.out.printf("In %s, you should wear a %s%n",
                season, whatToWear);

    }

    static void example4(){

        byte age = 100;
        /*
        -128            127;
         */
        age = (byte) -130;
        System.out.println(age);
    }
    static void example5(){

        calculator c = new calculator();

        byte num1 = 1, num2 = 2;
//        double result = c.add(1, 2);
        double result = c.add(num1, num2);
        System.out.println(result);

        int num5 = 100;  //int

        byte num6 = (byte)num5;

        /*
            implicit typecasting
                changing a smaller data type to a bigger one
                float => double
                byte => int
                int => long
                aka
                    promotion
        explicity
            opposite of implicit
                changing from bigger data type to smaller
                aka demotion
         */

        //how do I pass two values
        //for method (short, float)
        double result2 = c.add( (short)5, (float)10   );

        double result3 = c.add(1d, 2d);

        double result4 = c.add(5f, 2L);
    }
    static void example6(){

        System.out.println("Arrays");

        //how to create arrays

        String[] names = {"Ben", "Joe", "Mary"};

        System.out.println("Names as " + names.length + " values");
        System.out.println("First = " + names[0]);
        System.out.println("Last = " + names[names.length - 1]);

        String[] students = new String[3];

        int[] nums = new int[3];

        output(students);
        System.out.println("*".repeat(20));
        output(nums);
    }

    static void example7(){

        /*
                Row1Col1    Row1Col2    Row1Col3
                Row2Col1    Row2Col2    Row2Col3
                Row3Col1    Row3Col2    Row3Col3
         */
        String[][] data1 = new String[3][3];
        data1[0][0] = "Row1Col1";
        data1[0][1] = "Row1Col2";
        data1[0][2] = "Row1Col3";

        for(int row = 1; row < data1.length; row++){

            for(int col = 0; col < data1[row].length; col++){
                data1[row][col] = String.format("Row%dCol%d", row + 1, col + 1);
            }

        }

        Random random = new Random();
        int randomIndex = random.nextInt(data1.length); // amount of rowss
        output(data1[randomIndex]);

        System.out.println("Done");
    }
    static void output(String[] arr){
        for(String value : arr){
            System.out.println(value);
        }
    }
    static void output(int[] arr){
        for(int value : arr){
            System.out.println(value);
        }
    }
    void method1(){}
    public static void main(String[] args) {

        example7();

//        Week3 wk3 = new Week3();
//        wk3.method1();
    }
}