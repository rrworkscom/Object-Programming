public class MotorDemo {

    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.setLicensePlate("B 0838 XZ");
        motor1.setSpeed(50);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setLicensePlate("N 9840 AB");
        motor2.setIsMachineOn(true);
        motor2.setSpeed(40);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.setLicensePlate("D 8343 CV");
        motor3.setSpeed(60);
        motor3.displayStatus();

    }
}
