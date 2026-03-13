// Direct Chaining:------->


package Oops.Constructors;

public class Chaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Monu");
        Student s3 = new Student("Sonu", 21);
        Student s4 = new Student("Rohit", 22, 23);
        Student s5 = new Student("Saurav", 29, 121, "IIBM");

        System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s3.name + " " + s3.age);
        System.out.println(s4.name + " " + s4.age + " " + s4.rollNumber);
        System.out.println(s5.name + " " + s5.age + " " + s5.rollNumber + " " + s5.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        // name = "unknown";
        // age = 0;
        // rollNumber = 0;
        // college = "unknown";

        // Above 4 lines in 1 line using this:--->
        this("unknown", 0, 0, "unknown");
    }

    // Parameterized Constructor:---> (Using This)
    Student(String name) {
        // this.name = name;

        this(name, 0, 0, "unknown");

    }

    Student(String name, int age) {
        // this.name = name;
        // this.age = age;

        this(name, age, 0, "unknown");

    }

    Student(String name, int age, int rollNumber) {
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;

        this(name, age, rollNumber, "unknown");

    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

    }

    void markAttendance() {
        System.out.println("attendence marked by " + name);
    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
    }
}