public class Bee extends Animal {

    public String caste;

    public Bee(String caste, double weight, String food, String habitat) {
        super(weight, food, habitat);
        this.caste = caste;
    }

    @Override
    public void breathe() {
        System.out.println("Abdominal muscles relax, air enters through holes in the body segments");
        System.out.println("Trachea delivers oxygen");
        System.out.println("Abdominal muscles contract, air is expelled");
    }

    @Override
    public void move() {
        System.out.println("Flapping wings forward");
        System.out.println("Rotating wings nearly 90 degrees");
        System.out.println("Flapping wings backward");
    }

    @Override 
    public void printInfo() {
        super.printInfo();
        System.out.println("Caste   : " + this.caste);
    }
}
