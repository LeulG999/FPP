package product_pricing;
public class Electronics extends Product {
    private int warranty;
    private double warrantyCost;

    public int getWarranty() {
        return warranty;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    public Electronics(String productName, double price, int warranty, double warrantyCost){
        super(productName,price);
        this.warranty=warranty;
        this.warrantyCost=warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+warrantyCost;
    }

    @Override
    public String toString() {
        return super.toString()+"  "+"Warranty: "+getWarranty()+"  "+"Warranty Cost: "+getWarrantyCost();
    }
}
