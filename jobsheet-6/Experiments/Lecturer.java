public class Lecturer extends Employee {
    public String nidn;

    public Lecturer() {
        System.out.println("Object from class Lecturer has created");
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
