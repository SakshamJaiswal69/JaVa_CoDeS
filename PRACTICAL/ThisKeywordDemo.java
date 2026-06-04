// File: ThisKeywordDemo.java

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        // local parameter name == instance variable name
        // so we use this to refer to instance variable
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 25000.0);
        e1.showDetails();
    }
}

