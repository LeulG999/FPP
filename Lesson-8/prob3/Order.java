package homework.prob3;
public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;
    public Order(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // g) Overriding equals Method
    @Override
    public boolean equals(Object o) {
        // implement: same orderId => equal
        if(o==null)return false;
         if(o instanceof Order){
             Order other=(Order) o;
             return orderId.equals(other.orderId);
         }
       return false;
    }
    @Override
    public int hashCode() {
        // consistent with equals
        return 0;
    }
    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }
}
