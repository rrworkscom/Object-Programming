public class Refrigerator extends Electronic {
    public double capacity;
    public String model;

    public Refrigerator() {
        super();
    }

    public Refrigerator(String code, String brand, int warranty, double capacity, String model) {
        super(code, brand, warranty);
        this.capacity = capacity;
        this.model = model;
    }

    public void mode() {
        System.out.println("Refrigerator mode: Cool");
    }

    public String getInfo() {
        String info = "";
        info += "Capacity   : " + capacity + " L\n";
        info += "Model      : " + model + "\n";

        return info;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}