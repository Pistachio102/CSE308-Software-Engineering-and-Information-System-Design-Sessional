import java.util.ArrayList;
import java.util.List;

public class ABC {
    private List<Observer> clients = new ArrayList<>();
    private int previousState;
    private int currentState = 0;
    private String currentStateName = "Operational";
    private String previousStateName = "";

    public int getPreviousState() {
        return previousState;
    }

    public int getCurrentState() {
        return currentState;
    }

    public String getCurrentStateName() {
        return currentStateName;
    }

    public String getPreviousStateName() {
        return previousStateName;
    }

    public void setState(int newState)
    {
        previousState = currentState;
        currentState = newState;
        if (newState == 1 && previousState ==2)
        {
            currentStateName = "Partially Down";
            previousStateName = "Fully Down";
        }
        else if (newState == 1 && previousState ==0)
        {
            currentStateName = "Partially Down";
            previousStateName = "Operational";
        }
        else if (newState == 2 && previousState == 1)
        {
            currentStateName = "Fully Down";
            previousStateName = "Partially Down";
        }
        else if (newState == 2 && previousState == 0)
        {
            currentStateName = "Fully Down";
            previousStateName = "Operational";
        }
        else if (newState == 0 && previousState == 1)
        {
            currentStateName = "Operational";
            previousStateName = "Partially Down";
        }
        else if (newState == 0 && previousState == 2)
        {
            currentStateName = "Operational";
            previousStateName = "Fully Down";
        }


        notifyAllClients();
    }

    public void attach(Observer observer)
    {
        clients.add(observer);
    }

    public void detach(Observer observer)
    {
        clients.remove(observer);
    }

    public void notifyAllClients()
    {
        for (Observer observer:clients)
            observer.update();
    }
}
