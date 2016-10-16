package enthuware.ocajp.i.v8_2;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class Question {

    public static int k = 0;

    static {
        k = 10 / 0;
    }

    public static void main(final String[] args) {
        System.err.println("will not be printed because of the java.lang.ExceptionInInitializerError caused by an java.lang.ArithmeticException");
    }
}
