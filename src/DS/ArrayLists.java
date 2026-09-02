package DS;

import entities.Student;

import java.util.ArrayList;

public class ArrayLists {

    public static void example() {
        Student[] students =  new Student[3];
        students[0] = new Student(0, "Mihai");
        students[1] = new Student(1, "Cristi");
        students[2] = new Student(2, "Andrei");

        System.out.println(ArrayLists.buildStudentsList(students).toString());
    }

    static ArrayList<String> buildStudentsList(Student[] students) {
        ArrayList<String> list = new ArrayList<String>();
        for(Student student : students) list.add(student.getName());
        return list;
    };
}
