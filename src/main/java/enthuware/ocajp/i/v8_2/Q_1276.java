package enthuware.ocajp.i.v8_2;

/**
 * The catch block is throwing a checked exception (i.e. non-RuntimeException) which must be handled by either a try catch block or declared in the throws
 * clause of the enclosing method.
 * Note that finally is also throwing an exception here, but it is a RuntimeException so there is no need to handle it or declare it in the throws clause.
 *
 * @author daniel.bubenheim@gmail.com
 */
public class Q_1276 {

    class MyException extends Exception {
    }

    public static void main(final String[] args) {
        Q_1276 tc = new Q_1276();
        try {
            tc.m1();
        } catch (final MyException e) {
            tc.m1(); // Unhandled exception MyException
        } finally {
            tc.m2();
        }
    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }
}