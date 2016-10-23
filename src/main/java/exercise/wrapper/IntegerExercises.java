package exercise.wrapper;

/**
 *
 * http://stackoverflow.com/questions/508665/difference-between-parseint-and-valueof-in-java
 *
 *
 * @author daniel.bubenheim@gmail.com
 */
public class IntegerExercises {

    public static void main(final String... args) {

        Integer intObj1 = new Integer (25);
        Integer intObj2 = new Integer ("25");
        Integer intObj3= new Integer (35);
        //compareTo demo
        System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj2));
        System.out.println("Comparing using compareTo Obj1 and Obj3: " + intObj1.compareTo(intObj3));
        //Equals demo
        System.out.println("Comparing using equals Obj1 and Obj2: " + intObj1.equals(intObj2));
        System.out.println("Comparing using equals Obj1 and Obj3: " + intObj1.equals(intObj3));
        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float(2.25f);
        System.out.println("Comparing using compare f1 and f2: " +Float.compare(f1,f2));
        System.out.println("Comparing using compare f1 and f3: " +Float.compare(f1,f3));
        //Addition of Integer with Float
        Float f = intObj1.floatValue() + f1;
        System.out.println("Addition of intObj1 and f1: "+ intObj1 +"+" +f1+"=" +f );


        final Integer integer = Integer.valueOf("886655");
        System.out.printf("integer: %s%n", integer);

        //Converting from binary to decimal
        final Integer integerFromBinary = Integer.valueOf("1100101", 2);
        System.out.printf("integerFromBinary: %s%n", integerFromBinary);

        //Converting from octal to decimal
        final Integer integerFromOctal = Integer.valueOf("7537", 8);
        System.out.printf("integerFromOctal: %s%n", integerFromOctal);

        //Converting from hexadecimal to decimal
        Integer integerFromHexadecimal = Integer.valueOf("D", 16);
        System.out.printf("integerFromHexadecimal: %s%n", integerFromHexadecimal);
    }
}
