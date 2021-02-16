import java.util.ArrayList;
import java.util.Iterator;
public class File extends Components {
    private  String fileName;
    private String type = "File";
    private String fileDirectory;
    private Components parent;
    public int componentCount;
    private int spaces = 0;
    private ArrayList<Components> filesAndFolders = new ArrayList<>();

    public File(String name,String directory)
    {
        this.fileName = name;
        this.fileDirectory = directory;
        componentCount = 0;
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }

    public String getType() {
        return this.type;
    }

    public String getDirectory() {
        return this.fileDirectory;
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

    @Override
    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    @Override
    public ArrayList<Components> getFilesAndFolders() {
        return filesAndFolders;
    }

    @Override
    public void removeComponent(int index) {

    }

    @Override
    public void removeAll() {

    }

    public void rename(String name) {
        this.fileName = name;
    }

    @Override
    public void displayProperties() {
        System.out.println("Name : " + getFileName());
        System.out.println("Type : " + getType());
        System.out.println("Directory : "+getDirectory());
    }


    @Override
    public void printComponents() {

        System.out.print(getFileName());
        System.out.println();
    }
}
