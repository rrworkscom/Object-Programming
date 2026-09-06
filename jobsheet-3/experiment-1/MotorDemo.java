public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();
        motor1.licensePlate = "B 0838 XZ";
        motor1.speed = 50;
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.licensePlate = "N 9840 AB";
        motor2.isMachineOn = true;
        motor2.speed = 40;
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.licensePlate = "D 8343 CV";
        motor3.speed = 60;
        motor3.displayStatus();
        
    }
}
