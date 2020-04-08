package nailing.c5;

public class Problem03 {

    /**
     * Which option can be replaced to print 135
     * @param args
     */
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };

        for (int idx = 0; idx <= 4; idx++) {
            System.out.print(arr[idx]); // 12345
        }
        System.out.println();
        System.out.println("-----------");

        for (int idx = 0; idx < 5; idx += 2) {
            System.out.print(arr[idx]); // 135
        }
        System.out.println();
        System.out.println("-----------");

        for (int idx = 1; idx <= 5; idx += 1) {
            System.out.print(arr[idx]); // 23456
        }
        System.out.println();
        System.out.println("-----------");

        for (int idx = 1; idx < 5; idx += 2) {
            System.out.print(arr[idx]); // 24
        }
        System.out.println();
        System.out.println("-----------");
    }
}
