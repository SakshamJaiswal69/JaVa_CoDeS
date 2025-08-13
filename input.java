import java.util.Scanner;

public class input{
    public static void main(String[] args){
    
    System.out.println("It works !");
    Scanner IN = new Scanner(System.in);
    System.out.println("Enter a number ");
    int a=IN.nextInt();
    System.out.println("Enter a number ");
    int b= IN.nextInt();
    int sum=a+b;
    System.out.println("the sum of A & B are :");
    System.out.print(sum);
    }
}