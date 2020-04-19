package enthuware.ocpjp.i.v11_2;

public class Q_1087 {

    public static void main(String[] args) {

        byte b = 127;
        short s = 9;

        Short s2 = new Short((short) 1);
        System.out.println(s2 instanceof Short);

        int i = 9;
        System.out.println(i == s);

        Integer i2 = 9;
        System.out.println(i2 == s);


        Short k = 9;
        Integer i3 = 9;
        // System.out.println(k == i3);

        System.out.println(k instanceof Short);
    }
}
