public class Electronic {

    private final String code;
    public String brand;
    public int warranty;
    public double price;

    public Electronic() {
        this.code = "";
    }

    public Electronic(String code, String brand, int warranty, double price) {
        this.code = code;
        this.brand = brand;
        this.warranty = warranty;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public boolean turnOn() {
        System.out.println("The electronic is currently on");
        return true;
    }

    public double tax() {
        return price * 0.11;
    }

    public String getInfo() {
        String info = "";
        info += "Code       : " + code + "\n";
        info += "Brand      : " + brand + "\n";
        info += "Warranty   : " + warranty + " years\n";
        info += "Price      : " + price + "\n";

        return info;
    }
}