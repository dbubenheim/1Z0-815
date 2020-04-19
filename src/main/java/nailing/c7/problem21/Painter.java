package nailing.c7.problem21;

public class Painter {

    int age = 20;

    Painter(int age) {
        this.age = age;
    }

    public static class Picasso extends Painter {

        int age;

        Picasso() {
            //super();
            this(90);
        }

        Picasso(int age) {
            super(age);
            this.age = age;
        }

        @Override
        public String toString() {
            return super.age + ": " + this.age;
        }

        public static void main(String[] args) {

        }
    }
}
