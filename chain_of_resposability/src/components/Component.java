package components;

import events.click.ClickEvent;
import handlers.ClickHandler;

public interface Component extends ClickHandler, ClickEvent {
    public int getId();
    public void setId(int id);
    public void addChild(Component component);
    public void setParent(Component component);
}
