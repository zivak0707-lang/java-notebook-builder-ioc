package notebook;

public class ToshibaDisplayUnit implements DisplayUnit {

    @Override
    public String describeImageQuality() {
        return "IPS матриця зі стандартною кольоропередачею";
    }

    @Override
    public String getVendorName() {
        return "Toshiba Ltd";
    }

    @Override
    public int getResolutionWidth() {
        return 1366;
    }

    @Override
    public int getResolutionHeight() {
        return 768;
    }
}
