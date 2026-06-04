// File: SuperKeywordDemo.java

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Person name: " + name);
    }
}

class StudentPerson extends Person {
    String name; // child class variable with same name

    StudentPerson(String parentName, String childName) {
        super(parentName);  // call parent constructor
        this.name = childName;
    }

    @Override
    void display() {
        // display parent name
        System.out.println("Parent (Person) name using super: " + super.name);
        // display child name
        System.out.println("Child (Student) name using this: " + this.name);
        // call parent display
        super.display();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        StudentPerson sp = new StudentPerson("Mr. Raj", "Rohan");
        sp.display();
    }
}
