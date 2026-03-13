package Oops.Constructors;

public class ParaMeterized {
    public static void main(String[] args) {

        // Student s1 = new Student(); // for default Constructor
        Student s1 = new Student("Monu", 21, 12, "IIBM"); // for parameterized

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    // Default Constructor:--> (Java Create Automatically)

    // Student() {
    // name = "Aditya";
    // age = 28;
    // rollNumber = 101;
    // college = "IIBM";
    // }

    // // Parameterized Constructor:--->
    // Student(String n, int a, int rn, String c) {
    // name = n;
    // age = a;
    // rollNumber = rn;
    // college = c;
    // }

    // Parameterized Constructor:---> (Using This)
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