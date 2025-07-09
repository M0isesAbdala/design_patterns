import smartHome.facedes.HomeCinemaFacade;
import smartHome.facedes.HomeCinemaFacadeImpl;
import smartHome.gadget.Light;
import smartHome.gadget.SoundSystem;
import smartHome.gadget.Tv;

public class Main {

    public static void main(String[] args){
        HomeCinemaFacade homeCinemaFacade = new HomeCinemaFacadeImpl( new Light("Sala"), new SoundSystem("Sala"), new Tv("Sala"));

        homeCinemaFacade.turnOnCinema();
        System.out.println("acabou o filme");
        homeCinemaFacade.turnOffCinema();
    }
}
