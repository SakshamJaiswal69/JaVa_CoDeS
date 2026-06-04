// File: StaticDemo.java

class Counter {
    // static variable shared by all objects
    static int objectCount = 0;

    Counter() {
        objectCount++; // increment when object is created
    }

    // static method to show count
    static void showCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // calling static method using class name
        Counter.showCount();
    }
}
