package entities;

import prototype.Prototype;

public class Document implements Prototype {
    private String texto;

    public Document(String texto) {
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void exibir() {
        System.out.println("Conteúdo: " + texto);
    }

    @Override
    public Document clone() {
        return new Document(this.texto); // shallow copy
    }
}