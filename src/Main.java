
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Артем", "водитель", 150_000);
        employee.displayInfo();

        Department department = new Department("Илья", 100_000, "Отдел продаж");
        department.displayInfo();

        MainProgrammingLanguage mainProgrammingLanguage = new MainProgrammingLanguage("Арман", 500_000, "Java" );
        mainProgrammingLanguage.displayInfo();
    }
}