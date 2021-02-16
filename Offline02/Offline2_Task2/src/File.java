

public class File {
    private String fileName;
    private String type;
    private double size;
    private int duration;

    public File(String fileName,String type,double size,int duration)
    {
        this.fileName=fileName;
        this.type=type;
        this.size=size;
        this.duration=duration;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return
                "Name=" + fileName +
                ", Type=" + type +
                ", Size=" + size + " MB" +
                ", Duration=" + duration + " sec";
    }
}
