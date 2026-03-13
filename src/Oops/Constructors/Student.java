package Oops.Constructors;

public class Student {
    public static void main(String[] args) {
        Student2 s1 = new Student2();

        // Default Values:-->
        System.out.println(s1.name); // null
        System.out.println(s1.age); // 0
        System.out.println(s1.rollNumber); // 0
        System.out.println(s1.college); // null
        s1.markAttendance(); // attendence marked by null

        // now i am checking with local variable:--->
        // int x = 4; // local variable

        // int x; // local variable --> No Default value
        // System.out.println(x); // Error: --> variable not have been initialized

    }
}


class Student2 {
    String name; // information/data/characteristics --> instance variables
    int age;
    int rollNumber;
    String college;

    void markAttendance() { // behaviours --> functions --> instance methods
        System.out.println("attendence marked by " + name);
    }

}