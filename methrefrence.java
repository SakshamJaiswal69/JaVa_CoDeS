public class methrefrence{
    static void telljoke(){
        System.out.println("I invented this world!\n"+
        "Earth!");
    }
    static void change(int a){
        a=26;
    }
    static void change2(int []arr ){
        arr [0]=26;
    }
    public static void main(String[] args){
            // telljoke();
            
            // int x = 67;
            // change(x);
            // System.out.println("the value of x is "+x);

            int marks []={52,67,82,64,74};
            change2(marks);
            System.out.println("the value of x  is "+marks[0]);
        }
}
