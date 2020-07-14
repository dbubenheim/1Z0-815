package exercise.covariant;

import java.util.ArrayList;
import java.util.List;

public class Super {

    public List<? extends Number> getA() {
        return null;
    }

    public List<? super Number> getB() {
        return null;
    }

    public List<? super Integer> getC() {
        return null;
    }
}

class Sub extends Super {

    @Override
    public List<Integer> getA() {
        return null;
    }

    @Override
//  public List<Object> getB() {
    public List<Number> getB() {
//    public List<Integer> getB() { // does not compile
        return null;
    }

    @Override
//    public List<Object> getC() {
//    public List<Number> getC() {
//    public List<Integer> getC()
//    public ArrayList<Object> getC() {
//    public ArrayList<Number> getC() {
//    public ArrayList<Integer> getC() {
//    public ArrayList<? extends Object> getC() {  // does not compile
//    public ArrayList<? extends Number> getC() {  // does not compile
//    public ArrayList<? extends Integer> getC() { // does not compile
//    public ArrayList<? super Object> getC() {
//    public ArrayList<? super Number> getC() {
    public ArrayList<? super Integer> getC() {
        return null;
    }
}
