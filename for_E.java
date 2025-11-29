public class for_E{
    public static void main(String args[]){
        int [] arr ={10,20,30,40};
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int val : arr){
            
            System.out.println("Values are : "+ val);
            
        }
    }
}