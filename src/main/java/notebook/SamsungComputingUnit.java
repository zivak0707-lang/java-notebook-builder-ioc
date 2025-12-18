package notebook;

public class SamsungComputingUnit implements ComputingUnit {

    @Override
    public String describePerformance() {
        return "Samsung Exynos автомобільний процесор";
    }

    @Override
    public String getVendorName() {
        return "Samsung Electronics";
    }

    @Override
    public double getClockSpeed() {
        return 2.9;
    }

    @Override
    public int getCoreCount() {
        return 6;
    }
}
