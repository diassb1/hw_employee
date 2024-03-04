public class MainProgrammingLanguage extends Employee {
    String mainProgrammingLanguage;

    public MainProgrammingLanguage(String name, int salary, String mainProgrammingLanguage) {
        super(name, "Разработчик", salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Осной язык: " + mainProgrammingLanguage);
    }
}
