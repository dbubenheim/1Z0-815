package exercise;

class Char {

    char var;

    public static void main (String[] args) {

        char var1 = 'a';

        char var2 = var1;

        var2 = 'b';

        Char c1 = new Char();

        Char c2 = c1;

        c1.var = 'c';

        c2.var = 'd';

        System.out.print(var1 + ", " + var2);

        System.out.print(c1.var + ", " + c2.var);

        System.out.println("-------");

        int a = 0;
        System.out.println(a + a++ - a-- + " " + a);



        int b = 0;

        System.out.println(b++);
        System.out.println(-b--);
        System.out.println(b);

        //System.out.println(-1 + -2);
    }

}