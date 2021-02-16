public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType)
    {
        if (audioType.equalsIgnoreCase("mp4"))
        {
            advancedMediaPlayer = new mp4Player();
        }
        else if (audioType.equalsIgnoreCase("flv"))
        {
            advancedMediaPlayer = new flvPlayer();
        }
        else if (audioType.equalsIgnoreCase("vlc"))
        {
            advancedMediaPlayer = new vlcPlayer();
        }

    }

    @Override
    public void play(String audioType, File file) {
        if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMP4(file);
        else if (audioType.equalsIgnoreCase("flv"))
            advancedMediaPlayer.playFLV(file);
        else if (audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVLC(file);


    }
}
