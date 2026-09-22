package Automotive;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("E001", "Enzo", "Engine Mechanic");
        Employee emp2 = new Employee("E002", "Eduardo", "Suspension Technician" );

        Service srv1 = new Service("Brakes Maintenance", 400000, emp2);
        Service srv2 = new Service("Engine Check", 200000, emp1);

        Customer cs1 = new Customer("Ryan", "081234567890");
        Customer cs2 = new Customer("Padma", "082987654321");

        Vehicle car1 = new Vehicle("N 1234 YZ", "Jeep",
        "Wrangler", "Car", srv1);

        Vehicle motorcycle1 = new Vehicle("N 1111 WX", "Yamaha",
        "YZF-R1", "Motorcycle", srv2);

        Vehicle car2 = new Vehicle("DK 5678 AB", "Mazda",
        "MX-5", "Car", srv2);

        Vehicle motorcycle2 = new Vehicle("DK 2222 GH", "Honda",
        "Stylo 160", "Motorcycle", srv1);

        cs1.addVehicle(car1);
        cs1.addVehicle(motorcycle1);

        cs2.addVehicle(car2);
        cs2.addVehicle(motorcycle2);

        System.out.println(cs1.getInfo() + car1.getInfo() + motorcycle1.getInfo());

        System.out.println(cs2.getInfo() + car2.getInfo() + motorcycle2.getInfo());
    }
}