package Renderers;

public class RenderSvg implements Renderer{
    @Override
    public void renderCircle(float radius) {
        System.out.println("Renderizando círculo em SVG com raio " + radius);
    }
}
