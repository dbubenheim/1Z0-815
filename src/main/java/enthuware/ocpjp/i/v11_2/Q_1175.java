package enthuware.ocpjp.i.v11_2;

public class Q_1175 {

    public static void main(String[] args) {

        boolean a = "String".replace('g','G') == "String".replace('g','G');
        System.out.println("a: " + a);
        boolean b = "String".replace('g','g') == new String("String").replace('g','g');
        System.out.println("b: " + b);
        boolean c = "String".replace('g','G') == "StrinG";
        System.out.println("c: " + c);
        boolean d = "String".replace('g','g') == "String";
        System.out.println("d: " + d);
    }
}