package enthuware.ocpjp.i.v11_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Q_3073 {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x -> x.length();
        Consumer<Integer> c = x -> System.out.print("Len:" + x + " ");
        Predicate<String> p = x -> "".equals(x);

        // strList.forEach(f);
        // strList.forEach(c);
        // strList.forEach(p);

        Consumer<String> c2 = s -> System.out.println("s: " + s);
        strList.forEach(c2);
    }
}
