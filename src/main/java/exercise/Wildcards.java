package exercise;

import java.util.*;

public class Wildcards {

    public static void main(String[] args) {

        Collection<? extends Number> a;
        a = new TreeSet<Double>();
        a = new HashSet<Integer>();
        a = new ArrayList<Float>();

//        a.add(Double.valueOf(1.0));

        Collection<? super Integer> b;
        b = new TreeSet<Integer>();
        b = new HashSet<Number>();
        b = new ArrayList<Object>();

    }

    public void testCoVariance(List<? extends Child> myBlist) {
        Parent parent = new Parent();
        Child child = new Child();
        Grandchild grandchild = new Grandchild();
//        myBlist.add(parent); // does not compile
//        myBlist.add(child); // does not compile
//        myBlist.add(grandchild); // does not compile
        Parent p = myBlist.get(0);
    }

    public void testContraVariance(List<? super Child> list) {
        Parent parent = new Parent();
        Child b = new Child();
        Grandchild c = new Grandchild();
//        list.add(parent); // does not compile
        list.add(b);
        list.add(c);
//        Parent a = list.get(0); // does not compile
        Object a = list.get(0);
    }
}

class Parent {

    public ArrayList<Number> transform(Set<Integer> list) {

        return null;
    }
 }

class Child extends Parent {

//    public ArrayList<? super Number> transform(Set<Integer> list) {
//    public ArrayList<? extends Number> transform(Set<Integer> list) {
//    public ArrayList<? super Integer> transform(Set<Integer> list) {
//    public ArrayList<? extends Integer> transform(Set<Integer> list) {
//    public ArrayList<Integer> transform(Set<Integer> list) {
    public ArrayList<Number> transform(Set<Integer> list) {
        return null;
    }
}

class Grandchild extends Child {}


class Shape { void draw() {}}

class Circle extends Shape {void draw() {}}

class Square extends Shape {void draw() {}}

class Rectangle extends Shape {void draw() {}}

class Test {
    /*
     * Example for an upper bound wildcard (Get values i.e Producer `extends`)
     *
     * */

    public void testCoVariance(List<? extends Shape> list) {
//        list.add(new Shape()); // Error:  is not applicable for the arguments (Shape) i.e. inheritance is not supporting
//        list.add(new Circle()); // Error:  is not applicable for the arguments (Circle) i.e. inheritance is not supporting
//        list.add(new Square()); // Error:  is not applicable for the arguments (Square) i.e. inheritance is not supporting
//        list.add(new Rectangle()); // Error:  is not applicable for the arguments (Rectangle) i.e. inheritance is not supporting
        Shape shape= list.get(0);//compiles so list act as produces only

        /*You can't add a Shape,Circle,Square,Rectangle to a List<? extends Shape>
         * You can get an object and know that it will be an Shape
         */
    }
    /*
     * Example for  a lower bound wildcard (Put values i.e Consumer`super`)
     * */
    public void testContraVariance(List<? super Shape> list) {
        list.add(new Shape());//compiles i.e. inheritance is supporting
        list.add(new Circle());//compiles i.e. inheritance is  supporting
        list.add(new Square());//compiles i.e. inheritance is supporting
        list.add(new Rectangle());//compiles i.e. inheritance is supporting
//        Shape shape= list.get(0); // Error: Type mismatch, so list acts only as consumer
        Object object= list.get(0); // gets an object, but we don't know what kind of Object it is.

        /*You can add a Shape,Circle,Square,Rectangle to a List<? super Shape>
         * You can't get an Shape(but can get Object) and don't know what kind of Shape it is.
         */
    }
}