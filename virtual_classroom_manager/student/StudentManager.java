package student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String id, String classroomName) {
        students.add(new Student(id, classroomName));
        System.out.println("Student " + id + " has been enrolled in " + classroomName + ".");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("Students:");
            for (Student student : students) {
                System.out.println("- " + student.getId() + " in " + student.getClassroomName());
            }
        }
    }
}
