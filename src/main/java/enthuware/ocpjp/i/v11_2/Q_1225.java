package enthuware.ocpjp.i.v11_2;

public class Q_1225 {

    public static void main(String[] args) {

        char index = 0x0000; // NUL
        char c = "12345".charAt(index); // 1
        System.out.println(c);

        index = 0x0003; // ETX
        c = "12345".charAt(index);
        System.out.println(c); // 4

        char[] chars = Character.toChars(43); // +
        for (char c1 : chars) System.out.println(c1);

        c = "12345".charAt('1'); // index out of range 49
        System.out.println(c);
    }
}
