import java.util.Random;
import java.util.Scanner;

public class MiniExercise1 {
    public static void main(String[] args) {
        Task1();
        Task2();
    }
    static void Task1() {
        System.out.print("How many elem.s would u like to create? ");
        Scanner scanner =new Scanner(System.in);
        int numOfElems =scanner.nextInt();

        Object[] arr1 = new Object[numOfElems];
        for (int i=0;i<numOfElems;i++){
            System.out.print("Enter a value of an element: ");
            int value = scanner.nextInt();

            if (value==0 || value==1) {
                arr1[i]= (value == 1);
            } else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE){
                arr1[i]= (byte) value;
            } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                arr1[i]= (short) value;
            } else {
                arr1[i]= value;
            }
        }
        System.out.println("Array of the Elements is:- ");
        for (Object element:arr1) {
            System.out.println(element+" ("+element.getClass().getSimpleName()+")");
        }
    }


    static void Task2() {
        int[][] table = new int[10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++) {
                table[i][j]=(i + 1)*(j + 1);
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many quest.s would u like to ans.? ");
        int numOfQues = scanner.nextInt();

        int count=0;

        for (int i=0;i< numOfQues;i++) {
            int r1 = new Random().nextInt(10);
            int r2 = new Random().nextInt(10);

            int ans=table[r1][r2];
            System.out.print("What is the answer of "+(r1+1)+" x "+(r2+1)+" ? ");
            int inputAns = scanner.nextInt();
            if (inputAns==ans){
                System.out.println("Congo! You win.");
                count++;
            } else {
                System.out.println("Sorry Friend!! The correct answer is: " + ans+".");
            }
        }
//        math function is use to round the value
        int percent = (int)Math.round((count/(double)numOfQues) * 100);
        System.out.println("You answered "+count+ " out of " + numOfQues + ".");
        if (percent>75){
            System.out.println("You are a pro! Ur Percentage is "+percent+"%.");
        }else{
            System.out.println("This is ur percentage "+percent+"%.");
        }
    }
}

//  Output of the code:-
/*
How many elem.s would u like to create? 5
Enter a value: 1
Enter a value: 2
Enter a value: -126
Enter a value: 32456
Enter a value: 123456789
Array of the Elements is:-
true (Boolean)
2 (Byte)
-126 (Byte)
32456 (Short)
123456789 (Integer)
How many quest.s would u like to ans.? 5
What is the answer of 9 x 9 ? 81
Congo! You win.
What is the answer of 1 x 8 ? 8
Congo! You win.
What is the answer of 7 x 3 ? 21
Congo! You win.
What is the answer of 9 x 7 ? 72
Sorry Friend!! The correct answer is: 63.
What is the answer of 9 x 7 ? 63
Congo! You win.
You answered 4 out of 5.
You are a pro! Ur Percentage is 80%.
*/