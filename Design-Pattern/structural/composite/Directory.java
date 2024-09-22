package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileComponent {
    private String name;
    private List<FileComponent> components = new ArrayList<>();

    public Directory(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Directory name cannot be null or empty");
        }
        this.name = name;
    }

    public void add(FileComponent component) {
        components.add(component);
    }

    public void remove(FileComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileComponent component : components) {
            component.showDetails();
        }
    }
}
