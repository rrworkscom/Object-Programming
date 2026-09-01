public class BagDemo {
    public static void main(String[] args) {
        Bag bag1 = new Bag();
        bag1.brand = "Eiger";
        bag1.model = "Explorer 20L";
        bag1.material = "Polyester";
        bag1.displayInfo();

        Bag bag2 = new Bag();
        bag2.brand = "Alto";
        bag2.model = "Voyager Sling";
        bag2.material = "Nylon";
        bag2.displayInfo();
    }
}