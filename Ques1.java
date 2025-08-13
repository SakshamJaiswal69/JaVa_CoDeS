import java.util.Scanner;
public class Ques1{
    public static void main(String[] args){
        System.out.print("this program is to collect your marks.\nAnd make it in percentage.\n");

        System.out.print("Enter your Total Marks :");
        Scanner input1=new Scanner(System.in);
        int total = input1.nextInt();
        // System.out.println(total);
        // 
        System.out.print("Enter your Marks :");
        Scanner input2=new Scanner(System.in);
        int MA1 = input2.nextInt();
        // System.out.println(MA1);
        // 
        System.out.print("Enter your Marks :");
        Scanner input=new Scanner(System.in);
        int MA2 = input.nextInt();
        // System.out.println(MA2 );
        // 
        System.out.print("Enter your Marks :");
        Scanner input3=new Scanner(System.in);
        int MA3 = input3.nextInt();
        // System.out.println(MA3 );
        // 
        System.out.print("Enter your Marks :");
        Scanner input4=new Scanner(System.in);
        int MA4 = input4.nextInt();
        // System.out.println(MA4);
        // 
        System.out.print("Enter your Marks :");
        Scanner input5=new Scanner(System.in);
        int MA5 = input5.nextInt();
        // System.out.println(MA5);
        int sum =MA1 + MA2 + MA3 + MA4 + MA5;
        float per = (sum*100)/500.0f;
        System.out.println("Your Percentage is : " + per + "%");
        // this line is using concatenation to print the string and the variable part;
        

    }
}