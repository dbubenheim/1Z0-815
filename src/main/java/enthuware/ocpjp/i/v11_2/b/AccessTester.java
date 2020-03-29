package enthuware.ocpjp.i.v11_2.b;

import enthuware.ocpjp.i.v11_2.a.AccessTest;

public class AccessTester extends AccessTest {

    public static void main(String[] args) {

        AccessTest ref = new AccessTest();
        ref.d();
        //ref.value;
        // In the words of Java Language Specification, protected members of a class are accessible outside the package only in subclasses of that class, and only when they are fields of objects that are being implemented by the code that is accessing them. Basically, it implies that a protected member is accessible in the subclass only using a reference whose declared type is of the same subclass (or its subclass.).
        // ref.c();

        AccessTester accessTester = new AccessTester();
        // works just fine
        accessTester.c();
        int a = accessTester.value;
    }
}