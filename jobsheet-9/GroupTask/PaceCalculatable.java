package GroupTask;

public interface PaceCalculatable {

    public static final String defaultUnit = "min/km";

    double calculatePace(double distanceKm, int durationMinutes);

    void resetPace();
}