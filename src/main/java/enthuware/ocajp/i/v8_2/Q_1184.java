package enthuware.ocajp.i.v8_2;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class Q_1184 {

    public static void main(final String[] args) {
        firstOperation();
        secondOperation();
        thirdOperation();
    }

    private static void firstOperation() {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
        b1.append(b2.substring(2, 5).toUpperCase());
        printInfo(b1, b2);
    }

    private static void secondOperation() {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
        b2.insert(3, b1.append("a"));
        printInfo(b1, b2);
    }

    private static void thirdOperation() {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
        b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
        printInfo(b1, b2);
    }

    private static void printInfo(final StringBuilder b1, final StringBuilder b2) {
        System.out.printf("b1: %s, ", b1);
        System.out.printf("b2: %s%n", b2);
    }
}
