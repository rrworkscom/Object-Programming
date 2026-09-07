public class Motor {

    private String licensePlate;
    private boolean isMachineOn;
    private int speed; 

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isMachineOn() {
        return isMachineOn;
    }

    public void setIsMachineOn(boolean isMachineOn) {
        this.isMachineOn = isMachineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(!this.isMachineOn && speed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off");
        } else {
            this.speed = speed;
        }
    }

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
