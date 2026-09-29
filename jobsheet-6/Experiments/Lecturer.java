public class Lecturer extends Employee {

    public String nidn;

    public Lecturer(String nip, String nama, double salary, String nidn) {
        this.nidn = nidn;
        super(nip, nama, salary);
    }

    public String getInfo() {
        return "NIDN       : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
