package task01;

public class Main {
    public static void main(String[] args) {
        Employee engineer = new Employee("John", "chief engineer", "eng@mail.com", "+555-777-222", 54);

        System.out.println(
                "Employee name: " + engineer.getEmployeeName() + "\n" +
                "Employee position: " + engineer.getEmployeePosition() + "\n" +
                "Employee e-mail: " + engineer.getEmployeeEmail() + "\n" +
                "Employee phone: " + engineer.getEmployeePhone() + "\n" +
                "Employee age: " + engineer.getEmployeeAge() + "\n"
        );
    }
}
