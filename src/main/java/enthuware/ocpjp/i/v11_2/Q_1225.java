package enthuware.ocpjp.i.v11_2;

public class Q_1225 {

    public static void main(String[] args) {

//        char index = 0x0000; // NUL
//        char c = "12345".charAt(index); // 1
//        System.out.println(c);
//
//        index = 0x0003; // ETX
//        c = "12345".charAt(index);
//        System.out.println(c); // 4
//
//        char[] chars = Character.toChars(43); // +
//        for (char c1 : chars) System.out.println(c1);
//
//        c = "12345".charAt('1'); // index out of range 49
//        System.out.println(c);
//
//        Character c1 = new Character('c');
//
//        long l = 1;
//        float f = 3.5f;
//        boolean b = l == f;



        boolean flag = false;
        if (true)
            if (flag)
                System.out.println("1");
            else System.out.println("2");
        else System.out.println("3");


        if (true)  //1
            if (flag)   //2
                if (flag)   //3
                    System.out.println("False True");
                else        //4
                    System.out.println("True False");
//            else        //5
//                System.out.println("True True");
//        else        //6
//            System.out.println("False False");
    }
}
