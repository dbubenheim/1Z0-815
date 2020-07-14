package enthuware.ocpjp.i.v11_2;

public class Q_3206 {

    static double percent; //1
    //static final double percent = 0; //1
    int offset = 10, base = 50; // 2

    public static double calc(double value) {
        // var coupon, offset, base; //3
        var coupon = 0;
        var offset = 0;
        var base = 0;
        if (percent < 10) { // 4
            coupon = 15;
            offset = 20;
            base = 10;
        }
        return coupon * offset * base * value / 100; //5
    }

    public static void main(String[] args) {
        System.out.println(calc(100));
    }
}
