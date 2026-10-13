public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(UserProfile profile) {
        super(profile);
    }

    public void update_vehicle_details(int vehicle_id) {
        System.out.println(
            "Vehicle details updated: " + vehicle_id
        );
    }

    public void add_vehicle() {
        System.out.println("Vehicle added successfully");
    }

    public void retrieve_complain() {
        System.out.println("Retrieving complaints");
    }

    public void verify_user() {
        System.out.println("User verification completed");
    }

    public String getAllInfo() {
        return getProfile().getInfo();
    }
}