public class Electronic {
    public String code;
    public String brand;
    public int warranty;

    public Electronic() {
    }

    public Electronic(String code, String brand, int warranty) {
        this.code = code;
        this.brand = brand;
        this.warranty = warranty;
    }

    public boolean turnOn() {
        System.out.println("The electronic is currently on");
        return true;
    }

    public String getInfo() {
        String info = "";
        info += "Code       : " + code + "\n";
        info += "Brand      : " + brand + "\n";
        info += "Warranty   : " + warranty + " years\n";

        return info;
    }
}