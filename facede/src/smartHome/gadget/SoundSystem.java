package smartHome.gadget;

import smartHome.SmartHomeSystem;

public class SoundSystem extends AbstractGadget implements SmartHomeSystem {

    public SoundSystem(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("LIGOU o som " + this.name);
    }

    @Override
    public void off() {
        System.out.println("DESLIGOU o som " + this.name);
    }
}
