package nailing.c7.problem20;

public class A { }

class B extends A { }

class Test {

    public static void main(String[] args) {

        A[] a1 = {};
        A[] a2 = a1;
        B[] b = {};

        a1 = b;
        b = (B[]) a1;
        b = (B[]) a2;


        Animal[] animals = {};
        Dog[] dogs = { new Dog() };
        Cat[] cats = { new Cat() };

        animals = dogs;
        animals = cats;

        // dogs = (Dog[]) cats; // inconvertible types
        dogs = (Dog[])(Animal[]) cats; // ClassCastException

        cats = (Cat[])(Animal[]) dogs; // ClassCastException
        //cats = (Cat[]) dogs; // inconvertible types
    }
}