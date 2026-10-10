public class Employee {
    private String name;
    private String idNumber;
    private String grade;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGrade(String grade) {
        this.grade = grade;
        switch (grade.charAt(0)) {
            case '1':
                this.salary = 5000000;
                break;
            case '2':
                this.salary = 3000000;
                break;
            case '3':
                this.salary = 2000000;
                break;
            case '4':
                this.salary = 1000000;
                break;
            case '5':
                this.salary = 750000;
                break;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getGrade() {
        return grade;
    }

    public double getSalary() {
        return salary;
    }
}