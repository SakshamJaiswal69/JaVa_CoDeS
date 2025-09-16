 class Account{
    private int acc_id;    
    private String name ;
    private double balance ;

public Account()
{
    acc_id= 101;
    name="Saksham Jaiswal";
    balance=10000.00;
}
 public void show()
{
System.out.println("your Account id is : "+ acc_id);
System.out.println("your Name is : "+ name);
System.out.println("your Balance is : "+ balance);
}
 }
class UseAccount
{
    public static void main(String[] args){
        Account a = new Account();
        a.show();
    }
}