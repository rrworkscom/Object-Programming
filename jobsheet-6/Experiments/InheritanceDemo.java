public class InheritanceDemo {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer();

        lecturer1.name = "Yansy Ayuningtyas";
        lecturer1.nip = "34329837";
        lecturer1.salary = 3000000;
        lecturer1.nidn = "1989432439";

        System.out.println(lecturer1.getAllInfo());
    }
}
