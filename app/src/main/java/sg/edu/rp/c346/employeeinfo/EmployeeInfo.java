package sg.edu.rp.c346.employeeinfo;

public class EmployeeInfo {
    private String employeeName;
    private String employeeTitle;
    private double employeeSalary;

    public EmployeeInfo(String employeeName, String employeeTitle, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeTitle = employeeTitle;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeTitle='" + employeeTitle + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
