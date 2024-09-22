package behavioral.command;

import java.util.Scanner;

public class MainCommand {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter text to type (or 'undo' to undo last action, 'exit' to quit):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit"))
                break;

            if (input.equalsIgnoreCase("undo")) {
                editor.undo();
            } else {
                Command command = new TypeCommand(editor, input);
                editor.executeCommand(command);
            }
        }

        scanner.close();
    }
}
