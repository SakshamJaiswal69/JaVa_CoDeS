// Question multiplication table of any number.
public class methodQues{
    static void multiplication(int a){
        for (int i=1;i<11;i++){
            int b=a*i;
            System.out.println(a + " * "+ i + " = "+ b);
        }
    }
    public static void main(String[] args){
        multiplication(21);
    }
}
