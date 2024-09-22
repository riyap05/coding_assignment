package structural.composite;

public class MainComposite {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        Directory subDir = new Directory("SubDir");

        subDir.add(new File("SubFile1.txt"));
        root.add(file1);
        root.add(file2);
        root.add(subDir);

        root.showDetails();
    }
}
