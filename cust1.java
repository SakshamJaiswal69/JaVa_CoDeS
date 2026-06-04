class employee{
     
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    
    public String getname(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class cust1{
    public static void main(String[]args){
        employee ayush =new employee();
        ayush.setName("Ayush jaiswal");
        System.out.println(ayush.getname());
    }
}