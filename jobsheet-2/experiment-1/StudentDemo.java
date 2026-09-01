public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.nim = "023432";
        s1.name = "Yansy Ayuningtyas";
        s1.address = "Nias, North Sumatera";
        s1.grade = "2A";
        s1.displayBiodata();

        Student s2 = new Student();
        s2.nim = "034543";
        s2.name = "Aisyatul Huriyah";
        s2.address = "Malang, East Java";
        s2.grade = "2G";
        s2.displayBiodata();

        Student s3 = new Student();
        s3.nim = "045654";
        s3.name = "Tiara Pasha Ramadhani";
        s3.address = "Malang, East Java";
        s3.grade = "2G";
        s3.displayBiodata();
    }
}