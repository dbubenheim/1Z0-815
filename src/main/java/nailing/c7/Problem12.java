package nailing.c7;

public class Problem12 {

    public static void main(String[] args) {



        Byte a1 = 100;
        Short a2 = 200;
        Long a3 = a1 + (long) a2;

        // String a4 = (String) (a3 + a2); // cannot cast long to String
        // System.out.println("Result: " + a4);

        // Long a5 = a1 + a2;
        Long a5 = (long) a1 + a2; // explicit cast to long necessary
        System.out.println("a5: " + a5);

        Integer a6 = a1 + a2;
        System.out.println("a6: " + a6);

        Character a7 = 300;
        Integer a8 = a7 + a6;
        System.out.println("a8: " + a8);

    }
}