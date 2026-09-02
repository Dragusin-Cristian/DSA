package DS;

import entities.Student;

public class StringBuilders {
    public static void example() {
        Student[] students =  new Student[3];
        students[0] = new Student(0, "Mihai");
        students[1] = new Student(1, "Cristi");
        students[2] = new Student(2, "Andrei");

        System.out.println(StringBuilders.buildStudentsString(students));
    }

    static String buildStudentsString(Student[] students) {
        StringBuilder builder = new StringBuilder();
        for(Student student : students) builder.append(student.getName());
        return builder.toString();
    };
}
