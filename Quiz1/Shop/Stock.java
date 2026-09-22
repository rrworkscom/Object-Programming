public class Stock {
    private Product productID;
    private int quantity;
    private int shopNo;

    public Stock(Product productID, int quantity, int shopNo) {
        this.productID = productID;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public void modifyStock(int quantity) {
        this.quantity = quantity;
    }

    public void selectStockItem(String productID) {
        if (this.productID.getProductID().equals(productID)) {
            System.out.println("Stock item selected: " + productID);
        } else {
            System.out.println("Stock item not found.");
        }
    }

    public String getInfo() {
       String info = "";
        info += "\nProduct ID    : " + productID.getProductID();
        info += "\nQuantity      : " + quantity;
        info += "\nShop No.      : " + shopNo + "\n";

        return info;
    }
}