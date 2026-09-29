public class WifiRouter extends Electronic {
    public int speed;
    public double coverage;

    public WifiRouter() {
        super();
    }

    public WifiRouter(String code, String brand, int warranty, int speed, double coverage) {
        super(code, brand, warranty);
        this.speed = speed;
        this.coverage = coverage;
    }

    public void connectedDevice() {
        System.out.println("Devices connected to WiFi.");
    }

    public String getInfo() {
        String info = "";
        info += "Speed      : " + speed + " Mbps\n";
        info += "Coverage   : " + coverage + " GHz\n";

        return info;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}