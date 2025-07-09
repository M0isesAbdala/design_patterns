package smartHome.gadget;

import smartHome.SmartHomeSystem;

public class Tv extends AbstractGadget implements SmartHomeSystem {

    public Tv(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("LIGOU a tv " + this.name);
    }

    @Override
    public void off() {
        System.out.println("DESLIGOU a tv " + this.name);
    }
}
