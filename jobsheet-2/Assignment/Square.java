public class Square {

    public int length;
    public int width;

    public int getArea() {
        return length * width;
    }

    public int getCircumference() {
        return 2 * (length + width);
    }

    public void displayInfo() {
        System.out.println("Square Length           : " + length);
        System.out.println("Square Width            : " + width);
        System.out.println("Square Area             : " + getArea());
        System.out.println("Square Circumference    : " + getCircumference());
    }
}
