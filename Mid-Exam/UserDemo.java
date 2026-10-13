public class UserDemo {

    public static void main(String[] args) {

        UserProfile customerProfile = new UserProfile(411291, "usr1281", "Keegan", 20,
            "keeggannet@email.com", "Portofolio.pdf"
        );

        UserProfile adminProfile = new UserProfile( 11146, "adminone0", "Raynor", 26,
            "adminone@email.com", "Admin Identification.pdf"
        );

        Customer customer = new Customer(customerProfile);
        Admin admin = new Admin(adminProfile);

        System.out.println("   CUSTOMER");
        System.out.println(customer.getAllInfo());

        customer.log_in(411291, "usr1281");
        customer.apply_verification("Portofolio.pdf");
        customerProfile.show_documents();
        customer.log_out();

        System.out.println();

        System.out.println("   ADMIN");
        System.out.println(admin.getAllInfo());

        admin.log_in(11146, "adminone0");
        admin.add_vehicle();
        admin.update_vehicle_details(1110);
        admin.retrieve_complain();
        admin.verify_user();
        admin.log_out();
    }
}