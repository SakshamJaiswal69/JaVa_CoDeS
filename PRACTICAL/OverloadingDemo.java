public class OverloadingDemo {
    // same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingDemo d = new OverloadingDemo();
        System.out.println(d.add(2, 3));           // 5 (int)
        System.out.println(d.add(2.5, 3.1));       // 5.6 (double)
        System.out.println(d.add("Hello", "You")); // HelloYou (String)
    }
}
