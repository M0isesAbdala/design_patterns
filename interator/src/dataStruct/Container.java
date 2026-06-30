package dataStruct;

import interator.Aggregate;
import interator.Iterator;
import interator.impl.ContainerIterator;

import java.util.ArrayList;
import java.util.List;

public class Container implements Aggregate<Container> {
    private final List<Container> children = new ArrayList<>();
    private final String name;
    private Container parent = null;

    public Container(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Container getParent() {
        return parent;
    }

    public void setParent(Container parent) {
        this.parent = parent;
    }

    public void add(Container c){
        c.setParent(this);
        this.children.add(c);
    }

    public List<Container> getChildren() {
        return children;
    }

    public void greets(){
        String greets = "Eu sou: " + this.name;
        if(this.parent != null){
            greets += " " + " e meu pai é: " + this.parent.getName();
        }
        System.out.println(greets);
    }

    @Override
    public Iterator<Container> createIterator() {
        return new ContainerIterator(this);
    }
}
