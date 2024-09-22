package behavioral.observer;

import java.util.Scanner;

public class MainObserver {
    public static void main(String[] args) {
        Course course = new Course("Java Design Patterns");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.attach(student1);
        course.attach(student2);

        Scanner scanner = new Scanner(System.in);
        String update;

        System.out.println("Enter course updates (or 'exit' to quit):");

        while (true) {
            update = scanner.nextLine();
            if (update.equalsIgnoreCase("exit"))
                break;
            course.updateCourse(update);
        }

        scanner.close();
    }
}
