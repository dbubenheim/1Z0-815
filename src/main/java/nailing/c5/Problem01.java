package nailing.c5;

public class Problem01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,};

        for (int e : arr) {} // valid
        for (int i = 0; i < 0; i++) {} // valid
//        for (;;) {} // valid, has to be the last statement
//        for (int i; i < 0; i++) {} / invalid, i might not have been initialized
        for (boolean b = true; b; b = !b) {} // valid
    }
}