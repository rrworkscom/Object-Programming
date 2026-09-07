public class User {
    public String username;
    public String name;
    public String email;
    public String address;
    public String occupation;

    public User(String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Username: " + username);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Occupation: " + occupation);
        System.out.println("=================");
    }
}
