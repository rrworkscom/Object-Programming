package Experiment;

public class SmartFridge extends Fridges implements Audible {
    private int volume;

    public SmartFridge(int volume, int amountOfDoor,
                       double price, String color, String brand) {
        super(amountOfDoor, price, color, brand);
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nVolume: " + volume;
    }
}