public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();
        motor1.licensePlate = "B 0838 XZ";

        int newSpeed = 50;
        if(!motor1.isMachineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off");
        } else {
            motor1.speed = newSpeed;
        }

        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.licensePlate = "N 9840 AB";
        motor2.isMachineOn = true;
        newSpeed = 40;

        if(!motor2.isMachineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off");
        } else {
            motor2.speed = newSpeed;
        }

        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.licensePlate = "D 8343 CV";
        newSpeed = 60;

        if(!motor3.isMachineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off");
        } else {
            motor3.speed = newSpeed;
        }

        motor3.displayStatus();
    }
}
