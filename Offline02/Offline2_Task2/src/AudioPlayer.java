import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter adapter;
    private String playlistName;
    private List<File> playList = new ArrayList<>();

    public String getPlaylistName() {
        return playlistName;
    }

    public List<File> getPlayList() {
        return playList;
    }

    public void setPlayList(String name, List<File> playList) {
        playlistName = name;
        this.playList = playList;
    }

    @Override
    public void play(String audioType, File file) {
        if (audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println(file);
        }
        else if (audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("flv")||audioType.equalsIgnoreCase("vlc"))
        {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType,file);
        }
        else
        {
            System.out.println("Invalid media. \n" + audioType + " format not supported.");
        }

    }

    public void currentPlaylist()
    {
        if (playlistName == null && playList.size()== 0)
        {
            System.out.println("No playlist has been added yet.");
            System.out.println();
            return ;
        }

        if (playList.size()==0)
        {
            System.out.println("No file has been added to the playlist yet.");
            System.out.println();
            return;
        }

        System.out.println("Name of the current playlist : " + playlistName);
        for (int i=0; i<playList.size(); i++)
        {
            System.out.print(i+1  + ".   " );
            play(playList.get(i).getType(),playList.get(i));

        }
        System.out.println();
        return ;
    }
    public int durationOfThePlaylist()
    {
        int total = 0;
        for (int i=0; i<playList.size(); i++)
        {
            total = total + playList.get(i).getDuration();
        }
        return total;
    }

    public void addFile(File file)
    {
        playList.add(file);
    }

    public void addNewPlaylist(int elapsedTime , List<File> anotherPlaylist)
    {
        if (elapsedTime < durationOfThePlaylist())
        {
            System.out.println("Currently playing the playlist : " + playlistName);
            System.out.println("Can't add a new playlist.");
            System.out.println();
        }
        else
        {
            String newPlaylistName;
            Scanner input = new Scanner(System.in);
            System.out.println("Name of the playlist : ");
            newPlaylistName = input.nextLine();
            setPlayList(newPlaylistName,anotherPlaylist);

            System.out.println("A new playlist has been added.");
            currentPlaylist();
        }
    }
}
