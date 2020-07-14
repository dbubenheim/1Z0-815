package enthuware.ocpjp.i.v11_2;

public class Q_1291 {

    public static void main(String[] args) {
        Y y = new Y();
        y.fi = 20;
        System.out.println(y.fi);
        System.out.println(((X) y).fi);
    }

}
class X {
    final int fi = 10;
}
class Y extends X {
    int fi = 15;
}
