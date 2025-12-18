package notebook;

public class SonyDisplayUnit implements DisplayUnit {

    @Override
    public String describeImageQuality() {
        return "Triluminos 4K дисплей з HDR підтримкою";
    }

    @Override
    public String getVendorName() {
        return "Sony Corporation";
    }

    @Override
    public int getResolutionWidth() {
        return 3840;
    }

    @Override
    public int getResolutionHeight() {
        return 2160;
    }
}
