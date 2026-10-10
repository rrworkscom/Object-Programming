
public class WifiRouter extends Electronic {

    public int speed;
    public double coverage;

    public WifiRouter() {
        super();
    }

    public WifiRouter(String code, String brand, int warranty, double price, int speed, double coverage) {
        super(code, brand, warranty, price);
        this.speed = speed;
        this.coverage = coverage;
    }

    public void connectedDevice() {
        System.out.println("Devices connected to WiFi.");
    }

    @Override
    public double tax() {
        return price * 0.11;
    }

    @Override
    public String getInfo() {
        String info = "";
        info += "Speed      : " + speed + " Mbps\n";
        info += "Coverage   : " + coverage + " m²\n";
        info += "Tax        : " + tax() + "\n";

        return info;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
