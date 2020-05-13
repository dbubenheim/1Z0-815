package enthuware.ocpjp.i.v11_2;

public class Q_3237 {

    public static void main(String[] args) {


        char[][] a = {{'a', 'b', 'c'}, {'a', 'b', 'c'}};

        char b[][] = new char[3][];
        for (int i = 0; i < b.length; i++) b[i] = new char[4];

        char c[][] = {new char[]{'a', 'b', 'c'}, new char[]{'a', 'b', 'c'}};

        //char d[3][2] = new char[][]{{'a', 'b', 'c'}, {'a', 'b', 'c'}}; // does not compile

        // char[][] e = {"1234", "1234", "1234"}; // does not compile

        // var f[][] = new char[3][]; // does not compile
        // for (var i = 0; i < f.length; i++) f[i] = new char[4];

        var f = new char[2][];
    }
}
