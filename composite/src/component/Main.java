package component;

public class Main {
    public static void main(String[] args) {
        Component raiz = new Folder("root");

        Component pasta1 = new Folder("documentos");
        Component pasta2 = new Folder("imagens");

        Component arquivo1 = new File("curriculo", "pdf");
        Component arquivo2 = new File("foto", "png");
        Component arquivo3 = new File("leitura", "txt");

        ((Folder) pasta1).add(arquivo1);
        ((Folder) pasta2).add(arquivo2);
        ((Folder) pasta2).add(arquivo3);

        ((Folder) raiz).add(pasta1);
        ((Folder) raiz).add(pasta2);

        raiz.show("");
    }
}
