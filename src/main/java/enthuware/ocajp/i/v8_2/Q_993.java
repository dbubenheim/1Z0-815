package enthuware.ocajp.i.v8_2;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class Q_993 {

    public static void main(final String args[]) {
        A a = new A();
        B b = new B();
        a = b;
//        b = a; // Will not compile because 'a' is declared of class A and 'b' is of B which is a subclass of A. So an explicit cast is needed.
        a = (B) b;
        b = (B) a;
    }
}

class A {
}

class B extends A {
}