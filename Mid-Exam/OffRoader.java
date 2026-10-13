public class OffRoader extends Car {

    public String tireType;

    public OffRoader() {
        super();
    }

    public OffRoader(String code, String material, String color, String brand, String tireType) {
        super(code, material, color, brand);
        this.tireType = tireType;
    }

    @Override
    public void turnOn() {
        System.out.println("The off-roader engine is currently on");
    }

    public String getInfo(String brand, String color) {
        return "OffRoader Brand : " + brand + "\n"
             + "OffRoader Color : " + color + "\n";
    }

    @Override
    public void brake() {
        System.out.println("OffRoader is in breaking mode");
    }

    public void activateOffRoadMode() {
        System.out.println("Off-road mode activated");
    }

    @Override
    public String getAllInfo() {
        String info = super.getAllInfo();
        info += "Tire Type  : " + tireType + "\n";

        return info;
    }
}