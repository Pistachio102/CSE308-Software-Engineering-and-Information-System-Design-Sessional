import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drive extends Components {



    private String driveName;
    private String type = "Drive";
    private Components parent = null;
    public int componentCount;
    private int spaces = 0;
    private ArrayList<Components> filesAndFolders = new ArrayList<>();


    public Drive(String name)
    {
        driveName = name;
        componentCount = 0 ;
    }


    public String getDriveName() {
        return this.driveName;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String getDirectory() {
        return this.driveName;
    }

    @Override
    public Components getParent() {
        return this.parent;
    }

    @Override
    public Components setParent(Components parent) {
        return this.parent = parent;
    }

    @Override
    public int getComponentCount() {
        return this.componentCount;
    }

    public int getSpaces() {
        return this.spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public ArrayList<Components> getFilesAndFolders() {
        return this.filesAndFolders;
    }

    @Override
    public void addFile(Components file) {
        file.setSpaces(5);
        file.setParent(this);
        filesAndFolders.add(file);
        this.componentCount++;
    }

    @Override
    public void addFolder(Components folder) {
        folder.setSpaces(5);
        folder.setParent(this);
        filesAndFolders.add(folder);
        if (folder.getComponentCount()!=0)
        {
            this.componentCount = this.componentCount + folder.getComponentCount();
        }
        else
        {
            this.componentCount++;
        }
    }

    @Override
    public void removeComponent(int index) {
        this.filesAndFolders.get(index).removeAll();
        this.filesAndFolders.remove(index);

    }


    @Override
    public Components getFile(int index) {
        return filesAndFolders.get(index);
    }

    @Override
    public Components getFolder(int index) {
        return  filesAndFolders.get(index);
    }




    public void rename(String name) {
        this.driveName = name;
    }

    @Override
    public void displayProperties() {
        System.out.println("Name : " + this.getDriveName());
        System.out.println("Type : "+ this.getType());
        System.out.println("Component count : " + this.getComponentCount());
    }

    @Override
    public void printComponents() {

        System.out.println(this.getDriveName());
        Iterator<Components> iterator = filesAndFolders.iterator();
        while (iterator.hasNext())
        {
            Components component = iterator.next();


            for (int i=0 ; i<component.getSpaces() ; i++)
            {
                System.out.print("-");
            }
            component.printComponents();

        }



    }

}
