class Laptop{
    private String brand;
    private String model;
    private int ram;
    private int storage;
    Laptop(String brand,String model,int ram,int storage){
        this.brand=brand;
        this.model=model;
        this.ram=ram;
        this.storage=storage;
    }
    void showDetails(){
        System.out.println("Model :"+this.model);
        System.out.println("Brand :"+this.brand);
        System.out.println("Ram:"+this.ram+"GB");
        System.out.println("Storage :" + this.storage);
    }
}
public class Constructor{
    public static void main(String[] args){
        Laptop L1 =new Laptop("Dell","Inspirion",16,1024);
        L1.showDetails();
    }
}


