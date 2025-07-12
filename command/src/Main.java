import command.CommandManager;
import command.WriteFile;
import component.InputFile;

public class Main {
    public static void main(String[] args){
        InputFile inputFile = new InputFile();

        CommandManager.exec(new WriteFile("hello", inputFile));
        CommandManager.exec(new WriteFile("-", inputFile));
        CommandManager.exec(new WriteFile("world", inputFile));

        for (int i = CommandManager.size(); i > CommandManager.getIndex(); i--){
            CommandManager.undo();
        }

        do {
            System.out.println("DESFAZENDO O COMANDO");
        } while (CommandManager.undo());

        do {
            System.out.println("REFAZENDO O COMANDO");
        } while (CommandManager.shift());
    }
}
