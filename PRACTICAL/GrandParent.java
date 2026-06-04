// Multilevel inheritance example
class GrandParent {
    void familyName() {
        System.out.println("Family: Sharma");
    }
}

class Parent extends GrandParent {
    void parentJob() {
        System.out.println("Parent is a teacher");
    }
}

class Child extends Parent {
    void childHobby() {
        System.out.println("Child likes painting");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.familyName();   // from GrandParent
        c.parentJob();    // from Parent
        c.childHobby();   // from Child
    }
}
