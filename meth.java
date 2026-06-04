public class meth{
    // when we don't use static keyword them we have to make object for each method;
//     int logic (int a,int b){
//         int c ;
//         if (a>b){
//             c=a+b ;
//         }
//         else{
//         c=(a+b)*5;
//         }
//         return c;
//     }
//     public static void main (String[] args){
//         int x=42;
//         int y=20;
//         int z;
//         meth obj = new meth();
//         z =obj.logic(x,y);
//         System.out.println(z);
//     }
// }
  // when we use static keyword we don't have to make the objject for the method;
    static int logic (int a,int b){
        int c ;
        if (a>b){
            c=a+b ;
        }
        else{
        c=(a+b)*5;
        }
        return c;
    }
    public static void main (String[] args){
        int x=12;
        int y=20;
        int z;
        // meth obj = new meth();
        z =logic(x,y);
        // z =obj.logic(x,y);
        System.out.println(z);
    }
}
// this was method and now we we learn method overloading 
