package enthuware.ocpjp.i.v11_2;

public class Q_3203 {

    public static void main(String[] args) {

        // int a = b = c = 100; invalid: Chaining to use a value of a variable at the time of declaration is not allowed

        // int u = 100 = v = w; invalid: Chaining to use a value of a variable at the time of declaration is not allowed

        int u, v, w;
        u = v = w = 90;
        System.out.println("u = " + u + ", v = " + v + ", w = "+ w);

        int b, c;
        int a = b = c = 100;
        System.out.println("a = " + a + ", b = " + b + ", c = "+ c);

        int x, y, z = 200; // x and y are not initialized
        System.out.println("z = "+ z);

        int d = 300, e, f; // e and f are not initialized
        System.out.println("d = "+ d);

        //var l = 50, m = 60; invalid: var is not allowed in compound declaration
        //var l = m;
    }
}
