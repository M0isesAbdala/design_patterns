import Renderers.RenderCanvas;
import Renderers.RenderSvg;
import Renderers.Renderer;
import Shapes.AbstractShape;
import Shapes.Circle;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Renderer canvas = new RenderCanvas();
        Renderer svg = new RenderSvg();

        AbstractShape circulo1 = new Circle(canvas, 5);
        AbstractShape circulo2 = new Circle(svg, 10);

        circulo1.draw(); // Renderizando círculo em Canvas com raio 5
        circulo2.draw(); // Renderizando círculo em SVG com raio 10
    }
}
