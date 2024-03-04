public class Department extends Employee {
    String department;

    public Department(String name, String position, int salary, String department) {
        super(name, position, salary);
        super.position = "Менеджер";
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Отдел: " + department);
    }
}
