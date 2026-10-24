public class Snake extends Animal {
    public boolean isVenomous;

    public Snake(boolean isVenomous, double weight, String food, String habitat) {
        super(weight, food, habitat);
        this.isVenomous = isVenomous;
    }

    @Override
    public void move() {
        System.out.println("Contracting muscles from all sides to form curves");
        System.out.println("Finding anchor points like rocks or trees");
        System.out.println("Using scales to push the body forward");
    }

    @Override
    public void breathe() {
        System.out.println("Rib muscles contract, air enters through the nose");
        System.out.println("Trachea delivers air to the lungs");
        System.out.println("Rib muscles relax, air is expelled through the nose");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Venomous : " + (this.isVenomous ? "Yes" : "No"));
    }
}