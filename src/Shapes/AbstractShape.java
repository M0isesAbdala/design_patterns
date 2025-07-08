package Shapes;

import Renderers.Renderer;

public abstract class AbstractShape {
    protected Renderer renderer;

    public AbstractShape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
