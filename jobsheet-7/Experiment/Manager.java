public class Manager extends Employee {
    private double allowance;
    private String department;
    private Staff staffList[];

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setStaffList(Staff staffList[]) {
        this.staffList = staffList;
    }

    public void viewStaff() {
        int i;
        System.out.println("--------------------");
        for (i = 0; i < staffList.length; i++) {
            staffList[i].showInfo();
        }
        System.out.println("--------------------");
    }

    public void showInfo() {
        System.out.println("Manager Department: " + this.getDepartment());
        System.out.println("ID Number         : " + this.getIdNumber());
        System.out.println("Name              : " + this.getName());
        System.out.println("Grade             : " + this.getGrade());
        System.out.printf("Allowance         : %.0f\n", this.getAllowance());
        System.out.printf("Salary            : %.0f\n", this.getSalary());
        System.out.println("Department        : " + this.getDepartment());
        this.viewStaff();
    }

    @Override
    public double getSalary() {
        return super.getSalary() + allowance;
    }
}