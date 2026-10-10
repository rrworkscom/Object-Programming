public class Triangle {
    int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(
            Math.pow(sisiA, 2) + Math.pow(sisiB, 2)
        );
    }

    public static void main(String[] args) {
        Triangle trg = new Triangle();

        System.out.println(trg.totalSudut(60));
        System.out.println(trg.totalSudut(60, 50));
        System.out.println(trg.keliling(3, 4, 5));
        System.out.println(trg.keliling(3, 4));
    }
}
