package component;

public class File  implements Component{
    private String name;
    private String extension;
    private Component parent;

    public File(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "- Arquivo: " + this.name+ "." + this.extension);
    }

    @Override
    public Component getParent() {
        return this.parent;
    }

    @Override
    public void setParent(Component component) {
        this.parent = component;
    }
}
