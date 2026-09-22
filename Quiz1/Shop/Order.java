import java.util.ArrayList;
import java.util.Date;

public class Order {

    private String orderID;
    private Customer customer;
    private int amount;
    private Date orderDate;
    private ArrayList<Product> product;

    public Order(String orderID, Customer customer, int amount, Date orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.amount = amount;
        this.orderDate = orderDate;
        this.product = new ArrayList<>();
    }

    public void createOrder(Product product) {
        System.out.println("New Order:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Product ID: " + product.getProductID());
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void editOrder(String orderID, int amount, Date orderDate) {
        this.orderID = orderID;
        this.amount = amount;
        this.orderDate = orderDate;


        System.out.println("\nNew edited:");
    }

    public String getInfo() {
        String info = "";
        info += "Order ID     : " + this.orderID + "\n";
        info += "Amount       : " + this.amount + "\n";
        info += "Date         : " + this.orderDate + "\n";
        info += "\n";

        return info;
    }
}
