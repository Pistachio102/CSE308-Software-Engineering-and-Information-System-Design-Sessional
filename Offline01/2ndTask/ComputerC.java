public class ComputerC extends Computer {
    public ComputerC()
    {
        cpu="AMD C2-3265";
        mmu="JTP 56-4865";
        resolutionL=550;
        resolutionW=430;
        cpuSpeed=300;
    }

    @Override
    public String toString() {
        return "ComputerC{" +
                "cpu='" + cpu + '\'' +
                ", mmu='" + mmu + '\'' +
                ", resolution=" + resolutionL +
                "*" + resolutionW +
                ", cpuSpeed=" + cpuSpeed +
                '}';
    }
}
