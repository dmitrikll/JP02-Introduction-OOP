package task01;

public class Employee {
    private String employeeName;
    private String employeePosition;
    private String employeeEmail;
    private String employeePhone;
    private int employeeAge;

    public Employee(String employeeName, String employeePosition, String employeeEmail, String employeePhone, int employeeAge) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.employeeAge = employeeAge;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }
}


