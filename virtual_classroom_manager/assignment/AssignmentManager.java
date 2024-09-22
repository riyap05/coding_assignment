package assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentManager {
    private List<Assignment> assignments = new ArrayList<>();

    public void scheduleAssignment(String className, String details) {
        assignments.add(new Assignment(className, details));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void listAssignments() {
        if (assignments.isEmpty()) {
            System.out.println("No assignments scheduled.");
        } else {
            System.out.println("Assignments:");
            for (Assignment assignment : assignments) {
                System.out.println("- " + assignment.getDetails() + " for " + assignment.getClassName());
            }
        }
    }
}
