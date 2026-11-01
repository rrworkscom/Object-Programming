package Experiment;

public class TVs extends ElectronicTools implements Audible {
    private String screenType;
    private int volume;

    public TVs(String screenType, int volume, double price,
               String color, String brand) {
        super(price, color, brand);
        this.screenType = screenType;
        this.volume = volume;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void increaseVolume(int increment) {
        volume += increment;
    }

    @Override
    public void decreaseVolume(int decrement) {
        volume -= decrement;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nScreen Type: " + screenType + "\nVolume: " + volume;
    }
}