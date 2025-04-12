import entities.Arm;
import entities.Character;
import entities.Document;
import prototype.PrototypeGenerate;

public class Main {
    public static void main(String[] args) {
        Document original = new Document("Contrato padrão");
        Document copia = original.clone();

        copia.setTexto("Contrato personalizado");

        original.exibir(); // Conteúdo: Contrato padrão
        copia.exibir();    // Conteúdo: Contrato personalizado

        PrototypeGenerate registro = new PrototypeGenerate();

        // Criando protótipos base
        Arm espada = new Arm("Espada Longa");
        Arm arco = new Arm("Arco de Caça");

        Character guerreiro = new Character("Guerreiro", espada);
        Character arqueiro = new Character("Arqueiro", arco);

        // Registrando dinamicamente os protótipos
        registro.registrar("guerreiro", guerreiro);
        registro.registrar("arqueiro", arqueiro);

        // Clonando e customizando
        Character clone1 = (Character) registro.getPrototype("guerreiro");
        clone1.setName("Guerreiro das Sombras");
        clone1.setArm(new Arm("Espada Sombria"));

        Character clone2 = (Character) registro.getPrototype("arqueiro");
        clone2.setName("Arqueiro do Gelo");

        // Exibindo
        guerreiro.show(); // Personagem: Guerreiro, Arma: Espada Longa
        clone1.show();    // Personagem: Guerreiro das Sombras, Arma: Espada Sombria
        clone2.show();    // Personagem: Arqueiro do Gelo, Arma: Arco de Caça
    }
}