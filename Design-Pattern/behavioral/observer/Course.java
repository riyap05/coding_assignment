package behavioral.observer;

public class Course extends Subject {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public void updateCourse(String update) {
        System.out.println("Update for " + name + ": " + update);
        notifyObservers(update);
    }
}
