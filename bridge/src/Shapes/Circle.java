package Shapes;

import Renderers.Renderer;

public class Circle extends AbstractShape{
    private float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        this.renderer.renderCircle(this.radius);
    }
}
