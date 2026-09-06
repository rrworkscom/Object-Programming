public class Motor {
    public String licensePlate;
    public boolean isMachineOn;
    public int speed;

    public void displayStatus() {
        System.out.println("License Plate: " + this.licensePlate);

        if (isMachineOn) {
            System.out.println("Machine On");
        } else {
            System.out.println("Machine Off");
        }

        System.out.println("Speed:" + this.speed);
        System.out.println("==================");
    }
}