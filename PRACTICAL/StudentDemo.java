// File: StudentDemo.java

class Student {
    int rollNo;
    String name;
    String course;

    // 1. No-argument constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        course = "Not decided";
    }

    // 2. Constructor with rollNo and name
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = "Not decided";
    }

    // 3. Constructor with rollNo, name, and course
    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Course: " + course);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Saksham");
        Student s3 = new Student(2, "Rahul", "BCA");

        s1.display();
        s2.display();
        s3.display();
    }
}
