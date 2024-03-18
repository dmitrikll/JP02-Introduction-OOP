package task01;

public class Main {
    public static void main(String[] args) {
        Employee engineer = new Employee("John", "chief engineer", "eng@mail.com", "+555-777-222", 54);

        System.out.println(
                "Employee name: " + engineer.getName() + "\n" +
                "Employee position: " + engineer.getPosition() + "\n" +
                "Employee e-mail: " + engineer.getEmail() + "\n" +
                "Employee phone: " + engineer.getPhone() + "\n" +
                "Employee age: " + engineer.getAge() + "\n"
        );
    }
}
