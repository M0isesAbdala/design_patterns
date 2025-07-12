package command;

import component.InputFile;

public class WriteFile implements CommandWrite{
    private String value;
    private String oldValue;
    private InputFile file;

    public WriteFile(String value, InputFile file) {
        this.value = value;
        this.file = file;
        this.oldValue = file.getFile();
    }

    @Override
    public void exec() {
        this.file.setFile(this.file.getFile().concat(this.value));
    }

    @Override
    public void undo() {
        this.file.setFile(this.oldValue);
    }
}
