public class Vehicle {

    private final String code;
    public String material;

    public Vehicle() {
        this.code = "";
    }

    public Vehicle(String code, String material) {
        this.code = code;
        this.material = material;
    }

    public String getCode() {
        return code;
    }

    public void turnOn() {
        System.out.println("The vehicle is currently on");
    }

    public String getInfo() {
        String info = "";
        info += "Code       : " + code + "\n";
        info += "Material   : " + material + "\n";

        return info;
    }
}