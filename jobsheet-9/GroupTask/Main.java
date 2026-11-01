package GroupTask;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- TEST CASUAL BAND ---");
        CasualBand casual = new CasualBand("Xiaomi Mi Band", 80);
        casual.displayInfo();
        casual.trackHeartRate();
        casual.syncData();

        System.out.println("\n--- TEST PRO RUNNER BAND ---");
        ProRunnerBand pro = new EliteRunnerBand("Garmin", 95);
        pro.displayInfo();
        pro.trackHeartRate();

        double pacePro = pro.calculatePace(5.0, 25);
        System.out.println("Pace: " + pacePro + " " + PaceCalculatable.defaultUnit);

        System.out.println("\n--- TEST ELITE RUNNER BAND ---");
        EliteRunnerBand elite = new EliteRunnerBand("Polar", 100);
        elite.displayInfo();

        double paceElite = elite.calculatePace(10.0, 40);
        System.out.println("Pace: " + paceElite + " " + PaceCalculatable.defaultUnit);

        elite.resetPace();
    }
}