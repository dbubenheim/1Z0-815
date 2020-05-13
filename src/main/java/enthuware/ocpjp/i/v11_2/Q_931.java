package enthuware.ocpjp.i.v11_2;

public class Q_931 {

    public static void main(String[] args) {
        C1 c1 = new C2();
        c1.m1();

        System.out.println(c1.i);

        System.out.println(c1.getI());
    }
}

class C1 {

    int i = 10;

    public static void m1() {
        System.out.println("C1.m1();");
    }

    public int getI() {
        return this.i;
    }
}

class C2 extends C1 {

    int i = 20;

    public static void m1() {
        System.out.println("C2.m1();");
    }

   // public int getI() {
   //     return this.i;
   // }
}