public class UserProfile {

    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email;
    private String doc;

    public UserProfile() {
        this.user_id = 0;
        this.password = "";
        this.name = "";
        this.age = 0;
        this.email = "";
        this.doc = "";
    }

    public UserProfile(int user_id, String password,
                       String name, int age,
                       String email, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
        this.doc = doc;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void edit_profile() {
        System.out.println("Profile updated");
    }

    public void show_documents() {
        System.out.println("Document: " + doc);
    }

    public String getInfo() {
        String info = "";
        info += "User ID    : " + user_id + "\n";
        info += "Name       : " + name + "\n";
        info += "Age        : " + age + "\n";
        info += "Email      : " + email + "\n";
        info += "Document   : " + doc + "\n";

        return info;
    }
}