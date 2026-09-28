package testpackage;
public class Employee {
    public String nip;
    public String name;
    public double salary;

    public Employee() {
        System.out.println("Object from class Employee has created");
    }

    public String getInfo() {
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "Name       : " + name + "\n";
        info += "Salary     : " + salary + "\n";

        return info;
    }
}