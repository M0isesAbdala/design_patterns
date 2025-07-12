package command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private static List<CommandWrite> commandWrites = new ArrayList<>();
    private static int index = -1;

    private CommandManager() {
    }

    public static void exec(CommandWrite write){
        commandWrites.add(write);
        write.exec();
        index++;
    }

    public static boolean shift(){
        if(index < commandWrites.size() - 1){
            index++;
            CommandWrite write = commandWrites.get(index);
            write.exec();
            return true;
        }
        return false;
    }


    public static boolean undo(){
        if(index > -1){
            CommandWrite write = commandWrites.get(index);
            write.undo();
            index--;
            return true;
        }
        return false;
    }

    public static int getIndex(){
        return index;
    }

    public static int size(){
        return commandWrites.size();
    }
}
