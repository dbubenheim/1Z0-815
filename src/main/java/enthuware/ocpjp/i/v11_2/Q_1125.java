package enthuware.ocpjp.i.v11_2;

public class Q_1125 {

    public static void main(String[] args) {

        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long l1 = 1L;

        System.out.println(i1 == i2); // false, different object references
        System.out.println(i1 == i3); // true, because of unboxing
        // System.out.println(i1 == b1); // won't compile Integer vs. Byte
        System.out.println(i1.equals(i2)); // true, both have value 1
        System.out.println(i1.equals(l1)); // false, objects of different types
        System.out.println(i1.equals(b1)); // false, objects of different types
    }
}
