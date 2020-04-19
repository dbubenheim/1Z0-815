package nailing.c7.problem13;

public class Java extends Coffee {

    @Override
    public void run() {
        System.out.println("Java");
    }

    public static void main(String[] args) {
        Plant p1 = new Java();
        Plant p2 = new Coffee();
        Plant p3 = new Java();
        p1 = (Plant) p3; // casting is redundant
        Plant p4 = (Coffee) p3;
        p1.run();
        p4.run();
    }
}
