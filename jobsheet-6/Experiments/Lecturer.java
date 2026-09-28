public class Lecturer extends Employee {
    public String nidn;

    public Lecturer(String nip, String name, double salary, String nidn) {
        System.out.println("Object from class Lecturer created with parameterized constructor");
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
