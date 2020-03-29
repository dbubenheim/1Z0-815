package enthuware.ocpjp.i.v11_2;

public class Q_1203 {
}

class SomeBaseClass {

    void aMethod() {

    }

    public Object someMethod() {
        return null;
    }
}

class SomeChildClass extends SomeBaseClass {

    @Override
    protected void aMethod() {
        super.aMethod();
    }

    @Override
    public SomeChildClass someMethod() { // any return type (but primitives) is valid
        return null;
    }
}
