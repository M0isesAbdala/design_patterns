package events.click;

import java.util.function.Consumer;

public interface ClickEvent {
    public void click();
    public void onClick(Consumer<MouseClickEvent> event);
}
