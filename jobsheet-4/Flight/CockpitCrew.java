import java.time.LocalDate;
import java.util.ArrayList;

public class CockpitCrew {

    private String id;
    private String name;
    private String position;
    private ArrayList<Flight> flightSchedule;

    public CockpitCrew(String id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.flightSchedule = new ArrayList<Flight>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void addFlight(LocalDate date, String flightCode, String departure, String destination, String status, CockpitCrew pilot, CockpitCrew coPilot) {
        Flight flight = new Flight();
        flight.setDate(date);
        flight.setFlightCode(flightCode);
        flight.setDeparture(departure);
        flight.setDestination(destination);
        flight.setStatus(status);
        flight.setPilot(pilot);
        flight.setCoPilot(coPilot);

        flightSchedule.add(flight);
    }

    public String getInfo() {
        String info = "";

        info += "ID          : " + id + "\n";
        info += "Name        : " + name + "\n";
        info += "Position    : " + position + "\n";

        if (!flightSchedule.isEmpty()) {
            info += "\nFlight Schedule:\n";

            for (Flight flight : flightSchedule) {
                info += flight.getScheduleInfo();
            }
        } else {
            info += "\nThere is no flight schedule yet";
        }

        info += "\n";

        return info;
    }
}
