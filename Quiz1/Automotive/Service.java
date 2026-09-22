package Automotive;

public class Service {
    private String serviceName;
    private double servicePrice;
    private Employee employee;

    public Service(String serviceName, double servicePrice, Employee employee) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.employee = employee;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getInfo() {
        String info = "";
        info += "Service Name  : " + this.serviceName + "\n";
        info += "Service Price : Rp" + this.servicePrice + "\n";
        info += "Employee      : " + this.employee.getName() + "\n";
        info += "\n";

        return info;
    }
}