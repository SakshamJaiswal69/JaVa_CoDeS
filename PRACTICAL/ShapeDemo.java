// File: ShapeDemo.java

abstract class Shape {
    // abstract method - no body
    abstract double area();
}

// Circle is a Shape
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // implement abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle is a Shape
class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // implement abstract method
    @Override
    double area() {
        return length * breadth;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);      // polymorphism
        Shape s2 = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
