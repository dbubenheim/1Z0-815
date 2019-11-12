package enthuware.ocajp.i.v8_2;

public class Q_1034 {

    static Object m1() {
        return new Object();
    }

    static String m2() {
        return (String) m1();
    }

    static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        m2(); // java.lang.ClassCastException

        factorial(Integer.MAX_VALUE); // java.lang.StackOverflowError
    }
}
