public class Bag {
    public String brand;
    public String model;
    public String material;

    public String endurance(String material) {
        return "Bag made of " + material + " has strong endurance and is durable for daily use.";
    }

    public String compartment(String model) {
        return "Bag model " + model + " has multiple compartments for big storage.";
    }

    public void displayInfo() {
        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Material   : " + material);
        System.out.println("Endurance  : " + endurance(material));
        System.out.println("Compartment: " + compartment(model));
        System.out.println();
    }
}