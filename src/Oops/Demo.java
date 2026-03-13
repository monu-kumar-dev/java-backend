package Oops;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Monu";
        s1.age = 21;
        s1.rollNumber = 12;
        s1.college = "IIBM";

        s2.name = "Mohit";
        s2.age = 22;
        s2.rollNumber = 22;
        s2.college = "ZHI";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("attendence marked by " + name);
    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
    }
}