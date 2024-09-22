package classroom;

import java.util.ArrayList;
import java.util.List;

public class ClassroomManager {
    private List<Classroom> classrooms = new ArrayList<>();

    public void addClassroom(String name) {
        classrooms.add(new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            System.out.println("Classrooms:");
            for (Classroom classroom : classrooms) {
                System.out.println("- " + classroom.getName());
            }
        }
    }
}
