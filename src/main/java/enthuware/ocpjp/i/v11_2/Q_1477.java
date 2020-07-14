package enthuware.ocpjp.i.v11_2;

public class Q_1477 {
    public static void main(String[] args) {
        House ci = new MyHouse();
        System.out.println(ci.getAddress());
    }
}

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House {
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House { }