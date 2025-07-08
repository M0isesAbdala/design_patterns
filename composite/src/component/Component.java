package component;

public interface Component {
    void show(String indent);
    Component getParent();
    void setParent(Component component);
}