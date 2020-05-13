package enthuware.ocpjp.i.v11_2;

class D { }

class E extends D { }

class F extends E { }

class G {
    E getE() {
        return new E();
    }
}

class H extends G {

    // public F getE() { return new E(); } will not compile
    protected E getE() { return new F(); } // works fine
    // F getE() { return new F(); } // works fine
    // D getE() { return new D(); } // will not compile, cannot return superclass
}