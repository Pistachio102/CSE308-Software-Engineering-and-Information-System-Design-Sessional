import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Computers {
    public static void main(String[] args)
    {

        Components cDrive = new Drive("C:\\");
        Components music = new Folder("Music",cDrive.getDriveName()+"Music");
        Components mp3 = new Folder("mp3",music.getDirectory()+"\\mp3");
        Components rainbow = new File("rainbow.mp3",mp3.getDirectory()+"\\rainbow");
        Components groov = new File("groov.mp3",mp3.getDirectory()+"\\groov");
        Components mp4 = new Folder("mp4",music.getDirectory()+"\\mp4");
        Components sunshine = new File("sunshine.mp4",mp4.getDirectory()+"\\sunshine");
        Components fly = new File("fly.flv",music.getDirectory()+"\\fly");

        mp3.addFile(rainbow);;
        mp3.addFile(groov);
        mp4.addFile(sunshine);
        music.addFolder(mp3);
        music.addFolder(mp4);
        music.addFile(fly);
        cDrive.addFolder(music);
        cDrive.printComponents();

        music.displayProperties();








    }
}
