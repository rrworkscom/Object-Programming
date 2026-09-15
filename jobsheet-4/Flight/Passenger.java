public class Passenger {

    private String id;
    private String name;
    private String email;
    private String flightCode;

    public Passenger(String id, String name, String email, String flightCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.flightCode = flightCode;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        String info = "";

        info += "Passenger ID : " + id + "\n";
        info += "Name         : " + name + "\n";
        info += "Email        : " + email + "\n";
        info += "Flight Code  : " + flightCode + "\n";

        return info;
    }
}
