package GroupTask;

public class EliteRunnerBand extends ProRunnerBand implements PaceCalculatable {

    public EliteRunnerBand(String brandName, int batteryLevel) {
        super(brandName, batteryLevel);
    }

    @Override
    public void resetPace() {
        System.out.println("Resetting pace for Elite Runner...");
    }
}