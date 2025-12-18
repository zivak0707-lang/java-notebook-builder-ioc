package notebook;

public class Main {

    public static void main(String[] args) {

        // === IoC / Dependency Injection ===
        NotebookComputer premiumNotebook = new NotebookComputer(
                "Premium Configuration",
                new SonyDisplayUnit(),
                new SonyChassisUnit(),
                new IntelComputingUnit()
        );

        NotebookComputer budgetNotebook = new NotebookComputer(
                "Budget Configuration",
                new ToshibaDisplayUnit(),
                new ToshibaChassisUnit(),
                new ToshibaComputingUnit()
        );

        premiumNotebook.generateSpecificationReport();
        System.out.println("Performance score: " +
                premiumNotebook.calculatePerformanceScore());

        System.out.println();

        budgetNotebook.generateSpecificationReport();
        System.out.println("Performance score: " +
                budgetNotebook.calculatePerformanceScore());
    }
}
