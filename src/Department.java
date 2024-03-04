public class Department extends Employee {
    String department;

    public Department(String name, int salary, String department) {
        super(name, "Менеджер", salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Отдел: " + department);
    }
}
