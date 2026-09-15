import java.time.LocalDate;

public class Flight {

    private String flightCode;
    private LocalDate date;
    private String destination;
    private String departure;
    private String status;
    private CockpitCrew pilot;
    private CockpitCrew coPilot;

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public CockpitCrew getPilot() {
        return pilot;
    }

    public void setPilot(CockpitCrew pilot) {
        this.pilot = pilot;
    }

    public CockpitCrew getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(CockpitCrew coPilot) {
        this.coPilot = coPilot;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScheduleInfo() {
        String info = "";

        info += "\tDate: " + date;
        info += ", Flight Code: " + flightCode;
        info += ", From: " + departure;
        info += ", To: " + destination;
        info += ", \n\tStatus: " + status;
        info += ", Pilot: " + pilot.getName();
        info += ", Co-Pilot: " + coPilot.getName();
        info += "\n";

        return info;
    }
}
