package Automotive;

public class Vehicle {
    private String plateNumber;
    private String brand;
    private String model;
    private String vehicleType;
    private Service service;

    public Vehicle(String plateNumber, String brand, String model,
                   String vehicleType, Service service) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
        this.service = service;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Service getService() {
        return service;
    }

    public double calculateTotalCost() {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return service.getServicePrice() + 50000;
        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            return service.getServicePrice() + 20000;
        }

        return service.getServicePrice();
    }

    public String getInfo() {
        String info = "";
        info += "Vehicle Type  : " + this.vehicleType + "\n";
        info += "Plate Number  : " + this.plateNumber + "\n";
        info += "Brand         : " + this.brand + "\n";
        info += "Model         : " + this.model + "\n";
        info += "Service       : " + this.service.getServiceName() + "\n";
        info += "Service Price : Rp" + this.service.getServicePrice() + "\n";
        info += "Employee      : " + this.service.getEmployee().getName() + "\n";
        info += "Total Cost    : Rp" + this.calculateTotalCost() + "\n";

        return info;
    }
}