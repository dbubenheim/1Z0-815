package enthuware.ocpjp.i.v11_2;

public class Q_1082 {

    static int x = 5;

    public static void main(String[] args) {
        int x = (x = 3) * 4;
        System.out.println(x);
    }
}
