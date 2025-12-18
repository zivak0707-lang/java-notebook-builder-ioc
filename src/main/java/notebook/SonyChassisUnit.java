package notebook;

public class SonyChassisUnit implements ChassisUnit {

    @Override
    public String describePortability() {
        return "Преміум дизайн з магнієвим сплавом";
    }

    @Override
    public String getVendorName() {
        return "Sony Corporation";
    }

    @Override
    public double getThickness() {
        return 17.5;
    }

    @Override
    public String getMaterial() {
        return "Магнієвий сплав";
    }
}
