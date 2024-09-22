package behavioral.command;

public class TypeCommand implements Command {
    private String text;
    private TextEditor editor;

    public TypeCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.appendText(text);
    }

    @Override
    public void undo() {
        editor.removeText(text.length());
    }
}
