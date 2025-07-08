package players;

public class Mp3Player implements Player {
    public void play(String fileName) {
        System.out.println("Tocando MP3: " + fileName);
    }
}