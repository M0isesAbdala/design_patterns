package file;

public class FileImpl implements File{
    private String path;

    public FileImpl(String path) {
        this.path = path;
    }

    @Override
    public void readFile() {
        System.out.println("Você leu o arquivo " + this.path);
    }

    @Override
    public void writeFile(String file) {
        System.out.println("Você escreveu no arquivo " + this.path + " " +  file);
    }
}
