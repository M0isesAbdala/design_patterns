package smartHome.facedes;

import smartHome.gadget.Light;
import smartHome.gadget.SoundSystem;
import smartHome.gadget.Tv;

public class HomeCinemaFacadeImpl implements HomeCinemaFacade {
    private Light light;
    private SoundSystem soundSystem;
    private Tv tv;

    public HomeCinemaFacadeImpl(Light light, SoundSystem soundSystem, Tv tv) {
        this.light = light;
        this.soundSystem = soundSystem;
        this.tv = tv;
    }

    @Override
    public void turnOffCinema() {
        this.light.on();
        this.tv.off();
        this.soundSystem.off();
    }

    @Override
    public void turnOnCinema() {
        this.light.off();
        this.tv.on();
        this.soundSystem.on();
    }
}
