class person{
    String name;
    int age;
    person(){
        this("unknown",0);
    }
    person(String name){
        this(name,0);
    }
    person(String name,int age){
        this.name = name ;
        this.age =age ;
    }
    public void show()
    {
        System.out.println("Name "+name +" Age "+age);
    }
}
public class TEST{
    public static void main(String[] args){
            person p1 =new person();
            person p2 =new person("Saksham");
            person p3 =new person("Suryansh",21);
            p1.show();
            p2.show();
            p3.show();


        }
}
