package enthuware.ocajp.i.v8_2.b;
import enthuware.ocajp.i.v8_2.a.AccessTest;

public class AccessTester extends AccessTest {
    public static void main(String[] args) {

        AccessTest ref = new AccessTest();
        ref.d();
        // ref.c(); Has protected access
    }
}