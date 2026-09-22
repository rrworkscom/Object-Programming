package Automotive;

public class Employee {
    private String employeeID;
    private String name;
    private String position;

    public Employee(String employeeID, String name, String position) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getInfo() {
        String info = "";
        info += "Employee ID : " + this.employeeID + "\n";
        info += "Name        : " + this.name + "\n";
        info += "Position    : " + this.position + "\n";
        info += "\n";

        return info;
    }
}