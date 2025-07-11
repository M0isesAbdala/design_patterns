package events.click;

import components.Component;

public class MouseEvent {
    private boolean propagation = true;
    private final MouseClickEvent event;

    public MouseEvent(Component src) {
        this.event = new MouseClickEvent(src, () -> {
            this.propagation = false;
        });
    }

    public boolean isPropagation() {
        return this.propagation;
    }

    public MouseClickEvent getEvent() {
        return this.event;
    }
}
