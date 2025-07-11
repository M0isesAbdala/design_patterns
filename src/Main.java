import components.Button;
import components.Panel;

public class Main {

    public static void main(String[] args){
        Panel panel1 = new Panel(0);
        panel1.onClick((event) ->{
            System.out.println("CHEGOU O PANEL: " + panel1.getId() + " VALOR: " + event.getValue() + " origionou o evento: " + event.getSrc().getId());
        });

        Panel panel2 = new Panel(1);
        panel2.onClick((event) ->{
            System.out.println("CHEGOU O PANEL: " + panel2.getId() + " VALOR: " + event.getValue() + " origionou o evento: " + event.getSrc().getId());
        });

        Button btn = new Button(2);
        btn.onClick((event) -> {
            System.out.println("CHEGOU O BTN: " + btn.getId() + " VALOR: " + event.getValue() + " origionou o evento: " + event.getSrc().getId());
            event.setValue("test");
        });
        
        panel1.addChild(panel2);
        panel2.addChild(btn);
        btn.click();
    }
}
