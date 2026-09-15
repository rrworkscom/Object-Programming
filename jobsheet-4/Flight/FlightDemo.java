import java.time.LocalDate;

public class FlightDemo {

    public static void main(String[] args) {

        CockpitCrew rahayu = new CockpitCrew("1234", "Capt. Rahayu", "Pilot");
        CockpitCrew widjaja = new CockpitCrew("9876", "Capt. Widjaja", "Pilot");

        CockpitCrew sarah = new CockpitCrew("5678", "F/O Sarah", "Co-Pilot");
        CockpitCrew harry = new CockpitCrew("4321", "F/O Harry", "Co-Pilot");

        Passenger laras = new Passenger("334422", "Larasati", "laras@gmail.com", "GA101");
        Passenger marti = new Passenger("997744", "Martiana", "martiana@gmail.com", "GA202");

        rahayu.addFlight(LocalDate.of(2026, 9, 10), "GA101", "Malang",
                "Bandung", "Scheduled", rahayu, sarah);

        widjaja.addFlight(LocalDate.of(2026, 9, 11), "GA202", "Palembang",
        "Mataram", "Scheduled", widjaja, harry);

        System.out.println(widjaja.getInfo());
        System.out.println(rahayu.getInfo());

        System.out.println(laras.getInfo());
        System.out.println(marti.getInfo());
    }
}
