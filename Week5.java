public class Week5 {
    public static void main(String[] args) {
        double value= Math.pow(2, 3);
        System.out.println(value);

        Student student=new Student();
        student.getAge();

        student.something=123;
        student.getName();
        student.setName("hello");


        Car car =new Car();
//        car="blue";
        example2();
    }
    static void example2(){
        String s1="Hello";
        s1="World";
        s1="New Value";
        String s2=new String("Hello World");
        String s22="Hello World";
        //3 constructors: default, string, char[]
        char[] chars=s2.toCharArray();
        String s3=new String(chars);

        StringBuilder sb1=new StringBuilder();
        sb1.append("Hello");
        sb1.append(123);
        sb1.append(1f);
//        sb1=Hello1231.0 length=11
        System.out.println(sb1.length());
        //capacity: soft limit of max chars
        //if surpassed: increase by 1, double

        /*
        * sb has 3 constructors
        * default:
        * length=0
        * capacity=16
        * String
        * length:str length
        * capacity str length+16
        * int length:0
        * capacity: int passed*/
        StringBuilder sb2=new StringBuilder("Hello"); //22
        StringBuilder sb3=new StringBuilder(20);

        sb2.insert(1,"E"); //sb2=HEello
        sb2.replace(3,5,"bye"); //HEebyeo
    }
}
