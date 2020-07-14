package enthuware.ocpjp.i.v11_2;

import java.util.Arrays;

public class Q_3103 {

    public static void main(String[] args) {

        char[] a = {'h', 'e', 'l', 'l'};
        char[] b = {};
        int x = Arrays.compare(a, b);
        int y = Arrays.mismatch(a, b);
        System.out.println(x+" "+y);
    }
}
