package notebook;

public class ToshibaComputingUnit implements ComputingUnit {

    @Override
    public String describePerformance() {
        return "Toshiba низькоенергетичний процесор";
    }

    @Override
    public String getVendorName() {
        return "Toshiba Ltd";
    }

    @Override
    public double getClockSpeed() {
        return 2.1;
    }

    @Override
    public int getCoreCount() {
        return 4;
    }
}
