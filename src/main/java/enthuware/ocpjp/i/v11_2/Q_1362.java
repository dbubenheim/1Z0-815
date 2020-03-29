package enthuware.ocpjp.i.v11_2;

public class Q_1362 {

    public static void main(String[] args) {
        Sub s = new Sub();
        int k = s.i; // assigns 20 to k.
        System.out.println("k: " + k);
        k = ((Base)s).i; // assigns 10 to k. The cast is used to show the Base's i.
        System.out.println("k: " + k);
        Base b = new Sub();
        k = b.i; // assigns 10 to k because which field is accessed depends on the class of the variable and not on the class of the actual object. Same rule applies to static methods but the opposite is true for instance methods.
        System.out.println("k: " + k);

        System.out.println("Base.aMethod() = " + Base.aMethod()); // 100
        System.out.println("b.aMethod() = " + b.aMethod()); // 100
        System.out.println("s.aMethod() = " + s.aMethod()); // 200
        System.out.println("Sub.aMethod() = " + Sub.aMethod()); // 200
    }
}

class Base {
    int i = 10;
    static int aMethod() {
        return 100;
    }
}

class Sub extends Base {
    int i = 20; // This i hides Base's i.
    static int aMethod() {
        return 200;
    }
}