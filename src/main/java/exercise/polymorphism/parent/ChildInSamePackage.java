package exercise.polymorphism.parent;

public class ChildInSamePackage extends Parent {

    public static void main(String[] args) {

        ChildInSamePackage child = new ChildInSamePackage();
        child.myDefaultInt = 4;
        child.myDefaultStaticInt = 5;
        child.myProtectedInt = 7;
        child.myProtectedStaticInt = 2;

        ChildInSamePackage.myDefaultStaticInt = 6;
    }
}
