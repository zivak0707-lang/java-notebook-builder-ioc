package notebook;

public class NotebookComputer {

    private final DisplayUnit displayComponent;
    private final ChassisUnit chassisComponent;
    private final ComputingUnit computingComponent;
    private final String configurationName;

    public NotebookComputer(String configurationName,
                            DisplayUnit display,
                            ChassisUnit chassis,
                            ComputingUnit computing) {
        this.configurationName = configurationName;
        this.displayComponent = display;
        this.chassisComponent = chassis;
        this.computingComponent = computing;
    }

    public void generateSpecificationReport() {
        System.out.println("\n=== ТЕХНІЧНИЙ ПАСПОРТ НОУТБУКА ===");
        System.out.println("Конфігурація: " + configurationName);

        System.out.println("\n[Дисплей]");
        System.out.println("Виробник: " + displayComponent.getVendorName());
        System.out.println(displayComponent.describeImageQuality());
        System.out.println("Роздільна здатність: " +
                displayComponent.getResolutionWidth() + "x" +
                displayComponent.getResolutionHeight());

        System.out.println("\n[Корпус]");
        System.out.println("Виробник: " + chassisComponent.getVendorName());
        System.out.println(chassisComponent.describePortability());
        System.out.println("Товщина: " + chassisComponent.getThickness() + " мм");
        System.out.println("Матеріал: " + chassisComponent.getMaterial());

        System.out.println("\n[Процесор]");
        System.out.println("Виробник: " + computingComponent.getVendorName());
        System.out.println(computingComponent.describePerformance());
        System.out.println("Ядер: " + computingComponent.getCoreCount());
        System.out.println("Частота: " + computingComponent.getClockSpeed() + " ГГц");
    }

    public double calculatePerformanceScore() {
        return computingComponent.getCoreCount() * computingComponent.getClockSpeed();
    }
}
