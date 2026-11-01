package Experiment;

public class Fridges extends ElectronicTools {
    private int amountOfDoor;

    public Fridges(int amountOfDoor, double price,
                   String color, String brand) {
        super(price, color, brand);
        this.amountOfDoor = amountOfDoor;
    }

    public void setAmountOfDoor(int amountOfDoor) {
        this.amountOfDoor = amountOfDoor;
    }

    public int getAmountOfDoor() {
        return amountOfDoor;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nNumber of Doors: " + amountOfDoor;
    }
}