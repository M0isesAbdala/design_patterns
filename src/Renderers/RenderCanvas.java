package Renderers;

public class RenderCanvas implements Renderer{

    @Override
    public void renderCircle(float radius) {
        System.out.println("Renderizando círculo em Canvas com raio " + radius);
    }
}
