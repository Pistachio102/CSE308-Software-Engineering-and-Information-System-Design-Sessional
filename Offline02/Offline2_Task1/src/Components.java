import java.util.ArrayList;
import java.util.List;

public abstract class Components {

    public String getFileName() {throw new UnsupportedOperationException(); }
    public String getFolderName()
    {
        throw new UnsupportedOperationException();
    }
    public String getDriveName()
    {
        throw new UnsupportedOperationException();
    }
    public String getType()
    {
        throw new UnsupportedOperationException();
    }
    public String getDirectory() {throw new UnsupportedOperationException();}
    public abstract Components setParent(Components parent);
    public abstract Components getParent();
    public abstract int getComponentCount();
    public abstract void setSpaces(int spaces);
    public abstract int getSpaces();
    public ArrayList<Components> getFilesAndFolders(){throw new UnsupportedOperationException();}



    public void addFile(Components file)
    {
        throw new UnsupportedOperationException();
    }
    public void addFolder(Components folder)
    {
        throw new UnsupportedOperationException();
    }
    public void removeComponent(int index)
    {
        throw new UnsupportedOperationException();
    }
    public void removeAll(){throw new UnsupportedOperationException();}


    public Components getFile(int index)
    {
        throw new UnsupportedOperationException();
    }
    public Components getFolder(int index)
    {
        throw new UnsupportedOperationException();
    }



    public void rename(String name) {
        throw new UnsupportedOperationException();
    }
    public void displayProperties()
    {
        throw new UnsupportedOperationException();
    }
    public void printComponents()
    {
        throw new UnsupportedOperationException();
    }



}
