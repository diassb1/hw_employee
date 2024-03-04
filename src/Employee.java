public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.printf("""
                Имя: %s
                Должность: %s
                Зарплата: %s
                """.formatted(name, position, salary));
    }
}
