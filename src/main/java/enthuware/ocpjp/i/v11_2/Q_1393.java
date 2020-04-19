package enthuware.ocpjp.i.v11_2;

public class Q_1393 {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = "";
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }
        boolean b1 = newStr == myStr;
        boolean b2 = newStr.equals(myStr);
        System.out.println(b1 + " " + b2);
    }
}
