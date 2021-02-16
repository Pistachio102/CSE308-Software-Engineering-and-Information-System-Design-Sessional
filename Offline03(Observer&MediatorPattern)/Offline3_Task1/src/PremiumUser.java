import java.util.Scanner;
public class PremiumUser extends Observer {
    Scanner input = new Scanner(System.in);
    private int choice;
    private boolean state=false;
    public PremiumUser(ABC subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Current state of our server has been changed to " + this.subject.getCurrentStateName() + " from the state " + this.subject.getPreviousStateName() + ".");
        if (this.subject.getPreviousState()==3 && this.subject.getCurrentState()==1)
        {
            System.out.println("1.  Use service partially from the server of ABC and partially from the server of DEF?");
            System.out.println("2.  Use the service from the server of DEF?");
            choice = input.nextInt();
            if (choice==1)
            {
                System.out.println("Service is being provided partially from the server of ABC and partially from the server of DEF.");
                state = true;
            }
            else if (choice==2)
            {
                System.out.println("Service is being provided from the server of DEF.");
                state = false;
            }

        }
        else if (this.subject.getPreviousState()==3 && this.subject.getCurrentState()==2)
        {
            System.out.println("Service is being provided by our partner company DEF.");
        }
        else if (this.subject.getPreviousState()==1 && this.subject.getCurrentState()==2)
        {
            if (state)
            {
                System.out.println("Service is being provided from the server of DEF.");
            }

        }
        System.out.println();

    }
}
