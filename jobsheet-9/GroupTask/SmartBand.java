package GroupTask;

public abstract class SmartBand {

    public String brandName;
    public int batteryLevel;

    public SmartBand(String brandName, int batteryLevel) {
        this.brandName = brandName;
        this.batteryLevel = batteryLevel;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Battery: " + batteryLevel + "%");
    }

    public void syncData() {
        System.out.println("Synchronizing data for " + brandName + "...");
    }
}