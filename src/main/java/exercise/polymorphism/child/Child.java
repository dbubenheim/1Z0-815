package exercise.polymorphism.child;

import exercise.polymorphism.parent.Parent;

class Child extends Parent {

    public static void main(String[] args) {

        Child child = new Child();

        child.myProtectedInt = 7;
        child.myProtectedStaticInt = 2;

        // child.myDefaultInt = 4; // Cannot be accessed from outside package
        // child.myDefaultStaticInt = 5; // Cannot be accessed from outside package
        // Child.myDefaultStaticInt = 6; // Cannot be accessed from outside package

        System.out.println("a = " + child.a);
        System.out.println("b = " + child.b);
        // System.out.println("c = " + child.c); // Cannot be accessed from outside package
        // System.out.println("d = " + child.d); // Cannot be accessed from outside package


        Parent obj = new Child();
        System.out.println("a = " + obj.a);
        // System.out.println("b = " + obj.b); // has protected access, therefore not accessible (type Parent)
        // System.out.println("c = " + obj.c); // Cannot be accessed from outside package
        // System.out.println("d = " + obj.d); // Cannot be accessed from outside package
    }
}