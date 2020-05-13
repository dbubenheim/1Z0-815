package enthuware.ocpjp.i.v11_2;

import java.util.function.Function;

public class Q_3067 {

    public static void main(String[] args) {

        Function<Integer, String> f;

        f = Integer::toHexString;

        f = (a) -> Integer.toHexString(a);

        // f = a -> Integer::toHexString; // does not compile

        f = (Integer a) -> Integer.toHexString(a);

        // f = Integer a -> Integer.toHexString(a); // does not compile
    }
}
