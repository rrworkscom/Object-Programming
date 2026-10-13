public class Customer extends User {

    private boolean verification_status;

    public Customer() {
        super();
        verification_status = false;
    }

    public Customer(UserProfile profile) {
        super(profile);
        verification_status = false;
    }

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String doc) {
        System.out.println("Verification document submitted: " + doc);
        System.out.println("Waiting for admin verification");
    }

    public String getAllInfo() {
        String info = getProfile().getInfo();
        info += "Verification: " + verification_status + "\n";

        return info;
    }
}