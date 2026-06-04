class Parent {
    String name = "ParentClass";

    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    String name = "ChildClass";

    void showNames() {
        System.out.println("Child name = " + name);           // child's name
        System.out.println("Parent name = " + super.name);    // parent's name via super
    }

    void callParentGreet() {
        super.greet(); // calls Parent's greet()
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.showNames();
        c.callParentGreet();
    }
}
