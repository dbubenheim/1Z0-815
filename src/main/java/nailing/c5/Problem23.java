package nailing.c5;

public class Problem23 {

    public static void main(String[] args) {
        String[] starr = { "J", "a", "v", "a", "8" };
        for (int i = 0; i < starr.length; i++) {
            switch (starr[i]) {
                case "J":
                    System.out.print("J");
                    continue;
                case "a":
                    System.out.print("a");
                    continue;
                case "v":
                    System.out.print("v");
                    continue;
                case "8":
                    System.out.print("8");
                    break;
            }
        }
    }
}
