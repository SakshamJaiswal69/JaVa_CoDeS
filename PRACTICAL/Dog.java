// Single inheritance example
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal { // Dog inherits from Animal
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from Animal
        d.bark(); // from Dog
    }
}
