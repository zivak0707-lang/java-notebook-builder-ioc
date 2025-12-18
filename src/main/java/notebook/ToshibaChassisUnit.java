package notebook;

public class ToshibaChassisUnit implements ChassisUnit {

    @Override
    public String describePortability() {
        return "Класичний пластиковий корпус";
    }

    @Override
    public String getVendorName() {
        return "Toshiba Ltd";
    }

    @Override
    public double getThickness() {
        return 24.0;
    }

    @Override
    public String getMaterial() {
        return "Армований пластик";
    }
}
