public class Customer {

    private String customerID;
    private String customerName;
    private String address;
    private String phone;

    public Customer(String customerID, String customerName, String address, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public void addCustomer(String customerID, String customerName, String address, String phone) {
        Customer cust = new Customer(customerID, customerName, address, phone);
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void editCustomer(String customerID, String customerName, String address, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public void deleteCustomer() {
        this.customerID = null;
        this.customerName = null;
        this.address = null;
        this.phone = null;
    }

    public String getInfo() {
        String info = "";
        info += "Customer ID  : " + this.customerID + "\n";
        info += "Name         : " + this.customerName + "\n";
        info += "\n";

        return info;
    }
}
