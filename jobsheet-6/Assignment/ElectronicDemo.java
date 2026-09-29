public class ElectronicDemo {

    public static void main(String[] args) {

        WifiRouter router1 = new WifiRouter("WR001", "Starlink", 2, 250, 5);

        Refrigerator refrigerator1 = new Refrigerator("RRG001", "Samsung", 3, 255, "RT25");

        System.out.println("   WIFI ROUTER");
        System.out.println(router1.getAllInfo());
        router1.turnOn();
        router1.connectedDevice();

        System.out.println();

        System.out.println("   REFRIGERATOR");
        System.out.println(refrigerator1.getAllInfo());
        refrigerator1.turnOn();
        refrigerator1.mode();
    }
}