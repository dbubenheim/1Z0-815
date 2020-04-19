package enthuware.ocpjp.i.v11_2;

import java.util.ArrayList;

public class Q_3058 {

    // var s = new ArrayList<Student>(); var declaration is only allowed inside method bodies or for loops

    public static void main(String[] args) {

        var student = new Student();

        var allStudents = new ArrayList<>(); // type is Object

        allStudents.add(student);

        for (var s : allStudents) {
            System.out.println(s);
        }

        // Student s2 = allStudents.get(0); type is Object NOT Student
    }
}

class Student { }