package component;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{
    private String name;
    private List<Component> components = new ArrayList<>();
    private Component parent;

    public Folder(String name) {
        this.name = name;
    }

    public void add(Component comp){
        comp.setParent(this);
        this.components.add(comp);
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "+ Pasta: " + this.name);
        for (Component c : this.components) {
            c.show(indent + "  ");
        }
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
