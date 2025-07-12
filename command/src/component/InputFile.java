package component;

import command.CommandWrite;

public class InputFile  {
    private  String file = "";

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
        System.out.println("ESCREVEU NO FILE: "+ this.file);
    }

}
