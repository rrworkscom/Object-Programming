public class User {

    private UserProfile profile;

    public User() {
        profile = new UserProfile();
    }

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public int log_in(int user_id, String password) {
        if (profile.getUser_id() == user_id && profile.getPassword().equals(password)) {
            System.out.println("User Login successful");
            return 1;
        }

        System.out.println("Login failed");
        return 0;
    }

    public void recover_password() {
        System.out.println("Password recovery requested");
    }

    public void log_out() {
        System.out.println("User logged out");
    }
}