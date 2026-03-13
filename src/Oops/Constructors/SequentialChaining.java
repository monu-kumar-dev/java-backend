package Oops.Constructors;

public class SequentialChaining {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name); // unknown
        System.out.println(s1.age); // 0
        System.out.println(s1.college); // unknown

    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        this("unknown"); // calls next constructor
        System.out.println("First");
    }

    Student(String name) {
        this(name, 0); // calls next constructor
        System.out.println("second");
    }

    Student(String name, int age) {
        this(name, age, 0); // calls next constructor
        System.out.println("Third");
    }

    Student(String name, int age, int rollNumber) {
        this(name, age, rollNumber, "unknown"); // calls final constructor
        System.out.println("Fourth");
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

        System.out.println("Fifth");
    }
}