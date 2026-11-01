package Experiment;

public class Fans extends ElectronicTools {
    private String type;

    public Fans(String type, double price,
                String color, String brand) {
        super(price, color, brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nType: " + type;
    }
}