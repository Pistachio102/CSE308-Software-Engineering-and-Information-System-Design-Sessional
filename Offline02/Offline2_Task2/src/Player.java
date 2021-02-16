import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public static void main(String[] args)
    {
        AudioPlayer audioPlayer = new AudioPlayer();
        Scanner input = new Scanner(System.in);
        int option = 0;
        String fileName = "";
        String fileType = "";
        double fileSize ;
        int fileDuration ;
        boolean inTheLoop = true;

        while (inTheLoop)
        {
            System.out.println("1.  Display current playlist.");
            System.out.println("2.  Add new music file to the current playlist.");
            System.out.println("3.  Add new playlist to the audio player.");
            System.out.println("4.  Exit.");
            option = input.nextInt();

            if (option == 1)
            {
                audioPlayer.currentPlaylist();

            }
            else if (option == 2)
            {
                if (audioPlayer.getPlaylistName() == null && audioPlayer.getPlayList().size()==0)
                {
                    System.out.println("Create a playlist first to add music files.");
                    System.out.println();

                }
                else
                {
                    System.out.println("Enter the name of the music file : ");
                    fileName = input.next();
                    //System.out.println();
                    System.out.println("Enter the type of the music file : ");
                    System.out.println();
                    fileType = input.next();
                    System.out.println();
                    System.out.println("Enter the size of the music file : ");
                    fileSize = input.nextDouble();
                    System.out.println("Enter the duration of the music file : ");
                    fileDuration = input.nextInt();

                    File newFile = new File(fileName,fileType,fileSize,fileDuration);
                    audioPlayer.addFile(newFile);
                    System.out.println(fileName + "." + fileType + " has been added to the current playlist.");
                    System.out.println();
                }

            }
            else if (option == 3)
            {
                List<File> newPlaylist = new ArrayList<>();



                if (audioPlayer.getPlaylistName()==null && audioPlayer.getPlayList().size()== 0)
                {
                    audioPlayer.addNewPlaylist(0,newPlaylist);

                }

                else
                {
                    int elapsedtime;
                    System.out.println("Enter the elapsed time : ");
                    elapsedtime = input.nextInt();
                    audioPlayer.addNewPlaylist(elapsedtime,newPlaylist);
                }
            }

            else if (option == 4)
            {
                inTheLoop = false;
            }
        }
    }
}
