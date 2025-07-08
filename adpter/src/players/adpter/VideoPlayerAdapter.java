package players.adpter;

import players.Player;
import players.VideoPlayer;

public class VideoPlayerAdapter implements Player {
    private VideoPlayer videoPlayer;

    public VideoPlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String fileName) {
        videoPlayer.playVideoFile(fileName);
    }
}
