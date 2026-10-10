public class Staff extends Employee {
    private int overtime;
    private double overtimePay;

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    // Overloading method
    public double getSalary(int overtime, double overtimePay) {
        return super.getSalary() + overtime * overtimePay;
    }

    // Overriding method
    @Override
    public double getSalary() {
        return super.getSalary() + overtime * overtimePay;
    }

    public void showInfo() {
        System.out.println("ID Number    : " + this.getIdNumber());
        System.out.println("Name         : " + this.getName());
        System.out.println("Grade        : " + this.getGrade());
        System.out.println("Overtime Hours: " + this.getOvertime());
        System.out.printf("Overtime Pay : %.0f\n", this.getOvertimePay());
        System.out.printf("Salary       : %.0f\n", this.getSalary());
    }
}