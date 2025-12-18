package notebook;

public class SamsungDisplayUnit implements DisplayUnit {

    @Override
    public String describeImageQuality() {
        return "AMOLED панель із підвищеною контрастністю 1000000:1";
    }

    @Override
    public String getVendorName() {
        return "Samsung Electronics";
    }

    @Override
    public int getResolutionWidth() {
        return 1920;
    }

    @Override
    public int getResolutionHeight() {
        return 1080;
    }
}
