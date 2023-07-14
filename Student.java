/**
 * This is the official documentation of this wonder Student class
 * @author Sukhpreet Saini
 *@since 2023-06-08
 * @version 1.0
 * */
public class Student {
    //instance
    /* multiline comment not visible outside of the class*/

/**
 *  This is a default instance variable  */
    double something;
    private String name = "Student";
    private int age = 18;
    private double grade = 20;

    public Student(){}
//    method

    public Student(String name, int age, double grade) {
//        this.name = name;
//        this.age = age;
//        this.grade = grade;
        setAge(age);
        setName(name);
        setGrade(grade);
    }
    public Student(String name, double grade, int age) {
        this(name, age, grade);
    }
    public Student(int age, String name, double grade) {
        this(name, age, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    /**
     * This is the getters of the name instance variable
     * @return the value of the name instance variable
     * */
    public String getName() {
        return name;
    }

    /**
     * Set the value of the name instance variable
     * @param name*/
    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 110)
            this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >=20 && grade <=100)
            this.grade = grade;
    }

    //create an honorRollStudent
    public static Student honorRollStudent(){
        return new Student("Honor Roll", 19, 80d);
    }
    /***
     * Create Honor Roll Student object and set name, age * grade at some time. Enforce the 80+
     * @param name Student name, At least 3 chars
     * @param age Student age. Between 0 and 110 (inclusive)
     * @param grade Student grade. Between 20 and 100 (inclusive)
     * @return a new student object. E
     */
    public static Student honorRollStudent(String name, int age, double grade){

        /*
        ternary operator
            aka condense if statement

            if(grade < 80)
                grade = 80
            else
                grade = grade

        boolean expression ? statment if true : statement if false
         */

        return new Student(name, age, grade < 80 ? 80 : grade);
    }


    static public Student matureStudent(){

        Student student = new Student("Mature", 30, 75d);
        return student;
    }
    static public Student matureStudent(String name, double grade){

        return new Student(name, 30, grade);
    }

}