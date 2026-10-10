public class Main {

    public static void main(String[] args) {
        System.out.println("Testing Manager & Staff Class Program");

        Manager manager[] = new Manager[2];
        Staff staffGroup1[] = new Staff[2];
        Staff staffGroup2[] = new Staff[3];

        // Creating Manager 1
        manager[0] = new Manager();
        manager[0].setName("Tedjo");
        manager[0].setIdNumber("101");
        manager[0].setGrade("1");
        manager[0].setAllowance(5000000);
        manager[0].setDepartment("Administration");

        // Creating Manager 2
        manager[1] = new Manager();
        manager[1].setName("Atika");
        manager[1].setIdNumber("102");
        manager[1].setGrade("1");
        manager[1].setAllowance(2500000);
        manager[1].setDepartment("Marketing");

        // Staff Group 1
        staffGroup1[0] = new Staff();
        staffGroup1[0].setName("Usman");
        staffGroup1[0].setIdNumber("0003");
        staffGroup1[0].setGrade("2");
        staffGroup1[0].setOvertime(10);
        staffGroup1[0].setOvertimePay(10000);

        staffGroup1[1] = new Staff();
        staffGroup1[1].setName("Anugrah");
        staffGroup1[1].setIdNumber("0005");
        staffGroup1[1].setGrade("2");
        staffGroup1[1].setOvertime(10);
        staffGroup1[1].setOvertimePay(55000);

        manager[0].setStaffList(staffGroup1);

        // Staff Group 2
        staffGroup2[0] = new Staff();
        staffGroup2[0].setName("Hendra");
        staffGroup2[0].setIdNumber("0004");
        staffGroup2[0].setGrade("3");
        staffGroup2[0].setOvertime(15);
        staffGroup2[0].setOvertimePay(5500);

        staffGroup2[1] = new Staff();
        staffGroup2[1].setName("Arie");
        staffGroup2[1].setIdNumber("0006");
        staffGroup2[1].setGrade("4");
        staffGroup2[1].setOvertime(5);
        staffGroup2[1].setOvertimePay(100000);

        staffGroup2[2] = new Staff();
        staffGroup2[2].setName("Mentari");
        staffGroup2[2].setIdNumber("0007");
        staffGroup2[2].setGrade("3");
        staffGroup2[2].setOvertime(6);
        staffGroup2[2].setOvertimePay(20000);

        manager[1].setStaffList(staffGroup2);

        // Print information for managers and their staff
        manager[0].showInfo();
        manager[1].showInfo();
    }
}
