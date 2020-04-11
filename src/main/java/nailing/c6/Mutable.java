package nailing.c6;

public class Mutable {

    private StringBuilder builder;

    public Mutable(StringBuilder sb) {
        this.builder = new StringBuilder(sb);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }

    public static void main(String[] args) {

        new Mutable(new StringBuilder());
    }
}
