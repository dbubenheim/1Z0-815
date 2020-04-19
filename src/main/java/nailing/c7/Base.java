package nailing.c7;

public class Base {
    int type = 0;
    public void run() { }
}

class Derived extends Base  {

    int type = 1;

    public Derived() {
        type = 10;
    }

    @Override
    public void run() {
        System.out.println("running type = " + this.type);
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.run();
        System.out.println("type = " + b.type);


        Base p = null;
        Derived c = null;

        // Which four lines will compile?
        p = (Derived) new Derived();
        p = new Derived();
        c = (Derived) new Base();
        // c = new Base();
        c = new Derived(); p = c;
        // p = new Base(); c = p;

    }
}
