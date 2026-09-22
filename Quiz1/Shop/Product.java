public class Product {

    private String productID;
    private float productPrice;
    private String productType;

    public Product(String productID, float productPrice, String productType) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public void addProduct() {
        System.out.println("\nProduct added:");
        System.out.println(getInfo());
    }

    public String getProductID() {
        return productID;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void modifyProduct(String productID, float productPrice, String productType) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.productType = productType;

        System.out.println("New modified");
        System.out.println(getInfo());
    }

    public void selectProduct(String productID) {
        if (this.productID.equals(productID)) {
            System.out.println("Product selected: " + this.productID);
        } else {
            System.out.println("Product not found.");
        }
    }

    public String getInfo() {
        String info = "";
        info += "Product ID   : " + productID + "\n";
        info += "Price        : " + productPrice + "\n";
        info += "Type         : " + productType + "\n";
        info += "\n";

        return info;
    }
}
