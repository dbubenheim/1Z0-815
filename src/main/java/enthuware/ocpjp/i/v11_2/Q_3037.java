package enthuware.ocpjp.i.v11_2;

public class Q_3037 {

    // Only default, static and private methods of an interface can have a method body.
    // All other methods are abstract and must not have a body.
    // Further, if a method is abstract, it cannot be final at the same time.

    interface MyInterface {

        private void a() {
            System.out.println("a");
        };

        private final void a2() {
            System.out.println("a2");
        }

        // private final b() { }

        default void c() {
            System.out.println("c");
        }

        // static final void d() {  }

        static void e() {
            System.out.println("e");
        }

        // final void f() {  }

        // default final void g() { }

        // private abstract void h() { }

        // protected void i() { }
    }
}
