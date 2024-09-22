import classroom.ClassroomManager;
import student.StudentManager;
import assignment.AssignmentManager;

import java.util.Scanner;

public class VirtualClassroomManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomManager classroomManager = new ClassroomManager();
        StudentManager studentManager = new StudentManager();
        AssignmentManager assignmentManager = new AssignmentManager();

        while (true) {
            System.out.println(
                    "Options: add_classroom, add_student, schedule_assignment, list_classrooms, list_students, list_assignments, exit");
            System.out.print("Enter your option: ");
            String command = scanner.nextLine();

            switch (command.split(" ")[0]) {
                case "add_classroom":
                    System.out.print("Enter classroom name: ");
                    String className = scanner.nextLine();
                    classroomManager.addClassroom(className);
                    break;
                case "add_student":
                    System.out.print("Enter student ID and classroom name: ");
                    String input = scanner.nextLine();
                    String[] parts = input.split(" ");
                    if (parts.length < 2) {
                        System.out.println("Invalid input. Please enter both student ID and classroom name.");
                        break;
                    }
                    studentManager.addStudent(parts[0], parts[1]);
                    break;
                case "schedule_assignment":
                    System.out.print("Enter class name and assignment details: ");
                    String assignmentInput = scanner.nextLine();
                    String[] assignmentParts = assignmentInput.split(" ", 2);
                    if (assignmentParts.length < 2) {
                        System.out.println("Invalid input. Please enter both class name and assignment details.");
                        break;
                    }
                    assignmentManager.scheduleAssignment(assignmentParts[0], assignmentParts[1]);
                    break;
                case "list_classrooms":
                    classroomManager.listClassrooms();
                    break;
                case "list_students":
                    studentManager.listStudents();
                    break;
                case "list_assignments":
                    assignmentManager.listAssignments();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
