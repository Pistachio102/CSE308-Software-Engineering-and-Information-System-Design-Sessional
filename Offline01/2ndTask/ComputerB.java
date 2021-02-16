public class ComputerB extends Computer {
    public ComputerB() {
        cpu = "AMD B9-1265";
        mmu = "JTP 11-3578";
        resolutionL = 350;
        resolutionW=250;
        cpuSpeed = 200;
    }


    @Override
    public String toString() {
        return "ComputerB{" +
                "cpu='" + cpu + '\'' +
                ", mmu='" + mmu + '\'' +
                ", resolution=" + resolutionL +
                "*" + resolutionW +
                ", cpuSpeed=" + cpuSpeed +
                '}';
    }
}