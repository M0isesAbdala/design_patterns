package components;

import events.click.MouseClickEvent;
import events.click.MouseEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public abstract class AbstractClickableComponent implements Component {
    private int id;
    private List<Component> children = new ArrayList<>();
    private Component parent = null;
    private Consumer<MouseClickEvent> command;

    public AbstractClickableComponent(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void addChild(Component component) {
        component.setParent(this);
        children.add(component);
    }

    @Override
    public void setParent(Component component) {
        this.parent = component;
    }

    @Override
    public void next(MouseEvent event) {
        if(this.command != null){
            this.command.accept(event.getEvent());
        }
        if(event.isPropagation() && this.parent != null){
            this.parent.next(event);
        }
    }

    @Override
    public void click() {
        this.next(new MouseEvent(this));
    }

    @Override
    public void onClick(Consumer<MouseClickEvent> command) {
        this.command = command;
    }
}
