package enthuware.ocajp.i.v8_2;

public class Q_1256 {

    public Q_1256() {
    }
}

class Child extends Q_1256 {

    public Child() {
        super();
    }

    public Child(String s) {
        super();
        //this(); // won't compile - must be the first statement in constructor body
    }
}