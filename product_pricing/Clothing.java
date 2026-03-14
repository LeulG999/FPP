package product_pricing;
public class Clothing extends Product{
    private String brand;
    private int discount;

    public String getBrand() {
        return brand;
    }

    public int getDiscount() {
        return discount;
    }

    public Clothing(String productName, double price, String brand, int discount){
        super(productName,price);
        this.brand=brand;
        this.discount=discount;
    }
    public double getPrice(){
        double original=super.getPrice();
        double discountPrice=original*discount/100;
        return original-discountPrice;
    }
    @Override
    public String toString() {
        return super.toString()+"  "+"Brand: "+getBrand()+"  "+"Discount: "+getDiscount();
    }
}
