import java.util.ArrayList;
import java.util.Iterator;
public class Folder extends Components {

    private String folderName;
    private String type = "Folder";
    private  String folderDirectory;
    private Components parent;
    public int componentCount;
    private int spaces = 0;
    private ArrayList<Components> filesAndFolders = new ArrayList<>();


     public Folder(String name,String directory)
     {
         this.folderName = name;
         this.folderDirectory = directory;
         componentCount = 0;
     }



    @Override
    public String getFolderName() {
        return this.folderName;
    }

    public void rename(String name) {
        this.folderName = name;
    }

    public String getType() {
        return this.type;
    }

    public String getDirectory() {
        return this.folderDirectory;
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

    @Override
    public ArrayList<Components> getFilesAndFolders() {
        return filesAndFolders;
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
    public void removeAll() {
        int i = 0 ;
        for ( i=0; i<this.filesAndFolders.size() ; i++)
        {
            System.out.println(this.filesAndFolders.size());

            System.out.println("before");
            this.filesAndFolders.get(i).removeAll();


            System.out.println("after");
            this.filesAndFolders.remove(i);
            System.out.println(this.filesAndFolders.get(i).getType());
        }

        //this.filesAndFolders.remove(i);
    }

    @Override
    public Components getFile(int index) {
        return filesAndFolders.get(index);
    }

    @Override
    public Components getFolder(int index) {
        return filesAndFolders.get(index);
    }






    @Override
    public void displayProperties() {
        System.out.println("Name : " + getFolderName());
        System.out.println("Type : " + getType() );
        System.out.println("Directory : "+getDirectory());
        System.out.println("Component count : " + componentCount);

    }

    @Override
    public void printComponents() {
         System.out.print(getFolderName());
         System.out.println();

        Iterator<Components> folderIterator = filesAndFolders.iterator();


        while (folderIterator.hasNext())
        {
            Components components = folderIterator.next();
            Components temp = components.getParent();

            while (temp != null)
            {
                for (int j=0 ; j<temp.getSpaces(); j++)
                {
                    System.out.print(" ");
                }
                temp = temp.getParent();
            }
            for (int j=0 ; j<components.getSpaces(); j++)
            {
                System.out.print("-");
            }

            components.printComponents();



        }




    }
}

