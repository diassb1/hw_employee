public class MainProgrammingLanguage extends Employee {
    String mainProgrammingLanguage;

    public MainProgrammingLanguage(String name, String position, int salary, String mainProgrammingLanguage) {
        super(name, position, salary);
        super.position = "Разработчик";
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Осной язык: " + mainProgrammingLanguage);
    }
}
