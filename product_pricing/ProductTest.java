package product_pricing;
public class ProductTest {
    public static void main(String[] args){
        Product[] items=new Product[5];
        items[0]=new Clothing("Shirt",20,"Nike",5);
        items[1]=new Electronics("Mobile",600,12,230);
        items[2]=new Furniture("Table",200,230,MaterialType.WOOD);
        items[3]=new Clothing("Jacket",150,"Polo",7);
        items[4]=new Electronics("Laptop",2000,10,250);
        for(Product o:items){
            System.out.println(o);
        }
        System.out.println("Sum of Products: "+sumProducts(items));
    }
    public static double sumProducts(Product[]arr){
        if(arr==null)return 0.0;
        double sum=0;
        for(Product o:arr) {
            if (o != null) {
                sum += o.getPrice();
            }
        }
        return sum;
    }

}
