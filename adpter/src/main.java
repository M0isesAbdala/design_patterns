import players.Mp3Player;
import players.Player;
import players.VideoPlayer;
import players.adpter.VideoPlayerAdapter;

public class main {
    public static void main(String[] args) {
        Player mp3 = new Mp3Player();
        Player video = new VideoPlayerAdapter(new VideoPlayer());

        mp3.play("musica.mp3");
        video.play("filme.mp4");
    }
}