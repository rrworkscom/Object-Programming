package Automotive;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String phoneNumber;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public String getInfo() {
        String info = "";
        info += "Customer Name : " + this.name + "\n";
        info += "Phone Number  : " + this.phoneNumber + "\n";

        return info;
    }
}
