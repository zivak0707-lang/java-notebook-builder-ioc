package notebook;

public class SamsungChassisUnit implements ChassisUnit {

    @Override
    public String describePortability() {
        return "Ультракомпактний алюмінієвий корпус";
    }

    @Override
    public String getVendorName() {
        return "Samsung Electronics";
    }

    @Override
    public double getThickness() {
        return 14.9;
    }

    @Override
    public String getMaterial() {
        return "Анодований алюміній";
    }
}
