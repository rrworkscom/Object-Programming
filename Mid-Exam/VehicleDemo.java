public class VehicleDemo {

    public static void main(String[] args) {


        OffRoader offRoader = new OffRoader("OR001", "Steel", "Black", 
            "Jeep", "Mud-Terrain");

        System.out.println();

        System.out.println("   OFFROADER");
        System.out.println(offRoader.getAllInfo());
        offRoader.turnOn();
        offRoader.brake();
        offRoader.activateOffRoadMode();
    }
}