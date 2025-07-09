package smartHome.gadget;

import smartHome.SmartHomeSystem;

public class Light extends AbstractGadget implements SmartHomeSystem {

    public Light(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("LIGOU a luz " + this.name);
    }

    @Override
    public void off() {
        System.out.println("DESLIGOU a luz " + this.name);
    }
}
