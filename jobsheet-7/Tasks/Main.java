public class Main {
    public static void main(String[] args) {
        Human hmn1 = new Lecturer();
        Human hmn2 = new Student();

        hmn1.bernafas();
        hmn1.makan();

        hmn2.bernafas();
        hmn2.makan();
    }
}