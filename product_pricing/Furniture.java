package product_pricing;
public class Furniture extends Product {
    private double shippingCost;
    private MaterialType materialType;

    public double getShippingCost() {
        return shippingCost;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public Furniture(String productName, double price, double shippingCost, MaterialType materialType){
        super(productName,price);
        this.shippingCost=shippingCost;
        this.materialType=materialType;
    }
    public double getPrice(){
       return super.getPrice()+shippingCost;
    }
    @Override
    public String toString() {
        return super.toString()+"  "+"Shipping Cost: "+getShippingCost()+"  "+"Material Type: "+getMaterialType();
    }
}
