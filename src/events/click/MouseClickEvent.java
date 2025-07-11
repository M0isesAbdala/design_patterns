package events.click;

import command.Command;
import components.Component;

public class MouseClickEvent {
    private String value;
    private final Command stopPropagation;
    private final Component src;

    public MouseClickEvent(Component src, Command stopPropgation) {
        this.stopPropagation = stopPropgation;
        this.src = src;
    }

    public void stopPropagation(){
        this.stopPropagation.exec();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Component getSrc() {
        return src;
    }
}
