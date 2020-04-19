package enthuware.ocpjp.i.v11_2;

public class Q_1117 {

    public static void main (String args [ ]) {
        Automobile a = new Automobile();
        Truck t = new Truck();
        a.drive(); //1
        t.drive(); //2
        a = t;     //3
        a.drive(); //4
    }
}

class Automobile{
    public void drive() {  System.out.println("Automobile: drive");   }
}

class Truck extends Automobile{
    public void drive() {  System.out.println("Truck: drive");   }
}