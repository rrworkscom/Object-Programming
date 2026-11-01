package GroupTask;

public class CasualBand extends SmartBand implements HeartRateMonitor {

    public CasualBand(String brandName, int batteryLevel) {
        super(brandName, batteryLevel);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Casual Band ===");
        System.out.println("Brand: " + brandName + " | Battery: " + batteryLevel + "%");
    }

    @Override
    public void syncData() {
        System.out.println("Synchronizing Casual Band data...");
    }

    @Override
    public void trackHeartRate() {
        System.out.println("Monitoring heart rate (Casual)...");
    }
}