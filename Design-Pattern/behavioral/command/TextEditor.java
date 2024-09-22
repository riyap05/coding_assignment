package behavioral.command;

import java.util.Stack;

public class TextEditor {
    private StringBuilder content = new StringBuilder();
    private Stack<Command> commandHistory = new Stack<>();

    public void appendText(String text) {
        if (text != null && !text.trim().isEmpty()) {
            content.append(text);
            System.out.println("Current Content: " + content);
        }
    }

    public void removeText(int length) {
        if (length > 0 && length <= content.length()) {
            int start = content.length() - length;
            content.delete(start, content.length());
            System.out.println("Current Content: " + content);
        }
    }

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
