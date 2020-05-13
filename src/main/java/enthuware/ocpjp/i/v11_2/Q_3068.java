package enthuware.ocpjp.i.v11_2;

import java.util.ArrayList;
import java.util.Comparator;

public class Q_3068 {

    public static void main(String[] args) {

        var values = new ArrayList<String>();

        values.sort( (a,b) -> a.compareTo(b));

        // values.sort( var a, var b -> a.compareTo(b)); // does not compile

        values.sort( (var a, var b) -> a.compareTo(b));

        values.sort(Comparator.naturalOrder());

        values.forEach(System.out::println);

        // values.sort();

        values.removeIf((var k) -> k.equals("a"));

        // String[] sa = values.toArray(); // does not compile Object[]

        Object[] sa = values.toArray();

    }
}
