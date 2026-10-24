public class AbstractClassDemo {
    public static void main(String[] args) {
        Bee bee1 = new Bee("Queen", 0.05, "Nectar", "Forest");
        bee1.printInfo();
        bee1.move();
        bee1.breathe();
    }
}
