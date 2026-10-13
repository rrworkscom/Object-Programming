public class Car extends Vehicle {

    public String color;
    public String brand;

    public Car() {
        super();
    }

    public Car(String code, String material, String color, String brand) {
        super(code, material);
        this.color = color;
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.println("Car engine is ON");
    }

    public String getInfo(String brand) {
        return "Car Brand  : " + brand + "\n";
    }

    public void brake() {
        System.out.println("Car is breaking");
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "Color      : " + color + "\n";
        info += "Brand      : " + brand + "\n";

        return info;
    }
}