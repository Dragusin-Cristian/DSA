import entities.Student;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Student[] students =  new Student[3];
        students[0] = new Student(0, "Mihai");
        students[1] = new Student(1, "Cristi");
        students[2] = new Student(2, "Andrei");

        System.out.println(Main.buildStudentsMap(students).toString());
    }

    public static HashMap<Integer, String> buildStudentsMap(Student[] students) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (Student student : students) {
            map.put(student.getId(), student.getName());
        }
        return map;
    };

}