package enthuware.ocajp.i.v8_2;

/**
 * Given the following code, which statements are true?
 *
 * @author daniel.bubenheim@gmail.com
 */
public class Q_1003 {

    interface Automobile { String describe(); }

    static class FourWheeler implements Automobile{
        String name;
        public String describe(){ return " 4 Wheeler " + name; }
    }

    static class TwoWheeler extends FourWheeler{
        String name;
        public String describe(){ return " 2 Wheeler " + name; }
    }

    public static void main(String[] args) {
        TwoWheeler t = new TwoWheeler();
        Automobile a = new FourWheeler();


    }
}
