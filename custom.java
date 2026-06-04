class college{
    String Enr_no;
    String name;
    public void showdetails(){
        System.out.println("My Enrollment no. is "+Enr_no);
        System.out.println("My Name is "+name);
    }

    // public int getsalary(){
    //     return salary;
    // }
}
public class custom{
    public static void main(String[] args){
        college Ayush=new college();
        Ayush.Enr_no ="m2431017";
        Ayush.name = "Saksham";
        // Ayush.salary=35;
        System.out.println(salary);
        college Surya =new college();
        Surya.Enr_no="m2431021";
        Surya.name="Suryansh";
        // Surya.salary=35;
        Ayush.showdetails();
        Surya.showdetails();
        // int salary=Ayush.getsalary();
    }
}