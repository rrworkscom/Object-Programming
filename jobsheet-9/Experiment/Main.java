package Experiment;

public class Main {
    public static void main(String[] args) {

        TVs tv = new TVs("LED", 20, 5000000, "Black", "Samsung");
        Fridges fridge = new Fridges(2, 3000000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(
                15, 2, 7000000, "White", "Samsung");
        Fans fan = new Fans("Standing", 500000, "White", "Miyako");

        System.out.println("=== TV ===");
        System.out.println(tv.getInfo());

        System.out.println("\n=== FRIDGE ===");
        System.out.println(fridge.getInfo());

        System.out.println("\n=== SMART FRIDGE ===");
        System.out.println(smartFridge.getInfo());

        System.out.println("\n=== FAN ===");
        System.out.println(fan.getInfo());
    }
}