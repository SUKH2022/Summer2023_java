import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Assignment1 (Task 1)----------\n");
        System.out.print("Enter num1: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter mathematical operator(+, -, *, /): ");
        String op = scanner.next();

        int res = 0;
        if (op.equals("+")) {
            res = n1+n2;
        } else if (op.equals("-")) {
            res = n1-n2;
        } else if (op.equals("*")) {
            res = n1 * n2;
        } else if (op.equals("/")) {
            res = n1 / n2;
        }
//        else{
//            System.out.println("Sorry wrong input");
//        }
        System.out.println("The Result of the two no.s "+n1+" and "+n2+" with the mathematical operator "+op+" is = " + res);
        scanner.close();
    }
}
/*
----------Assignment1 (Task 1)----------

Enter num1: 2
Enter num2: 3
Enter mathematical operator(+, -, *, /): *
The Result of the two no.s 2 and 3 with the mathematical operator * is = 6

*/