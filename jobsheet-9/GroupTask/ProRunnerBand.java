package GroupTask;

public abstract class ProRunnerBand extends SmartBand {

    public ProRunnerBand(String brandName, int batteryLevel) {
        super(brandName, batteryLevel);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Pro Runner Band ===");
        System.out.println("Brand: " + brandName + " | Battery: " + batteryLevel + "%");
    }

    public void trackHeartRate() {
        System.out.println("Monitoring heart rate (Pro Runner)...");
    }

    public double calculatePace(double distanceKm, int durationMinutes) {
        if (distanceKm == 0) return 0;
        return durationMinutes / distanceKm;
    }
}