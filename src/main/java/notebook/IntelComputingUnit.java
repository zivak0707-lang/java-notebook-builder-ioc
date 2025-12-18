package notebook;

public class IntelComputingUnit implements ComputingUnit {

    @Override
    public String describePerformance() {
        return "Intel Core i7 11-го покоління (Tiger Lake)";
    }

    @Override
    public String getVendorName() {
        return "Intel Corporation";
    }

    @Override
    public double getClockSpeed() {
        return 4.7;
    }

    @Override
    public int getCoreCount() {
        return 8;
    }
}
