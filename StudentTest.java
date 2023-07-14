import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    static Student student;
    static int Num_Tests = 0;

    @BeforeEach
    public void actionToRunBeforeEachTest() {
        System.out.println("Hello Running test" + (++Num_Tests));
        student = new Student();
    }

    @AfterEach
    public void actionToRunAfterEachTest() {
        System.out.println();
    }

    @Test
    public void firstTest() {

        assertTrue(1 == 1);
        assertFalse(1 == 2);

        assertEquals(10, 10);

        //assertEquals(20d, 19.9, 0.1);
        // range is 22
        assertEquals(20d, 19.9, 2);
    }

    @Test
    public void testDefaultConstructor() {
        Student student = new Student();
        assertNotNull(student.getName());
        assertEquals("Student", student.getName());
        assertTrue(student.getName().length() >= 3);
    }

    //Annotation @Keyword
    @Test
    public void testDefaultConstructorGetAge() {
        assertTrue(student.getAge() == 18 && student.getAge() < 100);
        assertEquals(18, student.getAge());
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 25, 30, 35, 40, 45, 50, 55, 60, 70, 80, 90})
    //value source: primitive data types +string+objects
    public void testSetAgeValidValues(int age) {
        student.setAge(age);
        assertEquals(age, student.getAge());
    }

    @Test
    public void test3ArgConstructorHardCoded() {
        Student student1 = new Student("Sukh", 19, 100d);
        assertEquals("Sukh", student1.getName());
        assertEquals(19, student1.getAge());
        assertEquals(100d, student1.getGrade());
    }

    @ParameterizedTest
    @CsvSource({"Sukh,19,100", "Blanc,80,90", "Brandon,18,100", "Shy,19,100"})
    public void testing3ArgConstructorWithPassedValuesAllShouldBeValid(String name, int age, double grade) {
        Student student1 = new Student(name, age, grade);
        assertEquals(name, student1.getName());
        assertEquals(age, student1.getAge());
        assertEquals(grade, student1.getGrade());
    }

    //    write a parameterised tests for
//    set grade method
//    at least 3 tests
//    matureStudent method
//    at least 3 test
    @ParameterizedTest
    @CsvSource({"75", "80", "90"})
    public void testSetGrade(double grade) {
        student.setGrade(grade);
        assertEquals(grade, student.getGrade());
    }

//    @ParameterizedTest
//    @CsvSource({"17, false", "18, true", "19, true"})
//    public void testMatureStudent(int age, boolean expected) {
//        student.setAge(age);
//        assertEquals(expected, student.matureStudent());
//    }
}

/*
* Hello Running test1

Hello Running test2

Hello Running test3

Hello Running test4

Hello Running test5

Hello Running test6

Hello Running test7

Hello Running test8

Hello Running test9

Hello Running test10

Hello Running test11

Hello Running test12

Hello Running test13

Hello Running test14

Hello Running test15

Hello Running test16

Hello Running test17

Hello Running test18

Hello Running test19

Hello Running test20

Hello Running test21

Hello Running test22

Hello Running test23

* */