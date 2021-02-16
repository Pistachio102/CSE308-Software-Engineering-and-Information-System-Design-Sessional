public class ComputerA extends Computer {

    public ComputerA()
    {
        cpu="AMD A9-9425";
        mmu="JTP 11-9425";
        resolutionL=200;
        resolutionW=200;
        cpuSpeed=100;
    }

    @Override
    public String toString() {
        return "ComputerA{" +
                "cpu='" + cpu + '\'' +
                ", mmu='" + mmu + '\'' +
                ", resolution=" + resolutionL +
                "*" + resolutionW +
                ", cpuSpeed=" + cpuSpeed +
                '}';
    }
    /*@Override
    public String toString() {
        return "ComputerA{" +
                "CPU=" + cpu +
                ", MMU=" + mmu +
                ", Resolution='" + resolutionL + '\'' +
                ", CPU Speed=" + cpuSpeed +
                '}';*/
    }

