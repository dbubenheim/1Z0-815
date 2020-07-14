package enthuware.ocpjp.i.v11_2;

public class Q_1328 {

    public static void main(String[] args) {
        A1 a1 = new A1();
        A2 a2 = new A2();
        A3 a3 = new A3();

        a1 = (A2) (I) a2;

        a2 = (A2) (I) a1;

        // a1 = (I) a2;

        I i = (A3) a1;
    }
}

interface I {
}

class A1 implements I {
}

class A2 extends A1 {
}

class A3 extends A2 {
}
