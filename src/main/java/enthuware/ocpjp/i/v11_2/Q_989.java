package enthuware.ocpjp.i.v11_2;

public class Q_989 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.delete(0, sb.length());
        // sb.clear(); does not compile
        // sb.empty(); does not compile
        // sb.deleteAll(); does not compile
        // sb.removeAll(); does not compile
    }
}
