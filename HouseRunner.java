public class HouseRunner {
    public static void main(String[] args) {
        House house1= new House(5,"White",200.00);
        House house2= new House(3,2500.00);
        House house3=new House(2,"Blue", 3500.00);

        System.out.println("________________Assignment 1 (Task 2 and 3)_____________________\n");

        System.out.printf("House1:-\nNo. of rooms in the house is %d, Color is %s, and square feet area is %2f .\n",house1.getNumberOfRooms(), house1.getColor()
                ,house1.getArea());
        System.out.printf("House2:-\nNo. of rooms in the house is %d. Color ia %s, and square feet area is %2f .\n",house2.getNumberOfRooms(), house2.getColor()
                ,house2.getArea());
        System.out.printf("House3:-\nNo. of rooms in the house is %d. Color is %s, and square feet area is %2f .\n",house3.getNumberOfRooms(), house3.getColor()
                ,house3.getArea());
    }
}
/*
 ________________Assignment 1 (Task 2 and 3)_____________________

House1:-
No. of rooms in the house is 5, Color is White, and square feet area is 200.000000 .
House2:-
No. of rooms in the house is 3. Color ia null, and square feet area is 2500.000000 .
House3:-
No. of rooms in the house is 2. Color is Blue, and square feet area is 3500.000000 .
*/