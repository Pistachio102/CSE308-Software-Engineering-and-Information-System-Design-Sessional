public class ComputerFactory {

    public String computerName;


    public Computer getComputer(String name) {
        this.computerName=name;
        if (computerName == null)
        {
            return null;
        }

        if (computerName.equalsIgnoreCase("ComputerA"))
        {
            return new ComputerA();
        }
        else if (computerName.equalsIgnoreCase("ComputerB"))
        {
            return new ComputerB();
        }
        else if (computerName.equalsIgnoreCase("ComputerC"))
        {
            return new ComputerC();
        }
        return null;
    }
}
