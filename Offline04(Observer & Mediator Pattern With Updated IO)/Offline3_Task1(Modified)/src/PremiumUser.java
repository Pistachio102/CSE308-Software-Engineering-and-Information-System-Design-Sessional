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
        System.out.println("Premium user prompt: Server is " + this.subject.getCurrentStateName() + " now." );
        if (this.subject.getPreviousState()==0 && this.subject.getCurrentState()==1)
        {
            System.out.println("Do you want to use service from two servers (partially from the server of our company and partially from the server of DEF company) or from one server (server of DEF company)? \n" +
                    "Please choose:");
            System.out.println("1.  one server");
            System.out.println("2.  two servers");
            choice = input.nextInt();
            if (choice==1)
            {
                //System.out.println("Service is being provided partially from the server of ABC and partially from the server of DEF.");
                state = false;
            }
            else if (choice==2)
            {
               // System.out.println("Service is being provided from the server of DEF.");
                state = true;
            }

        }
        else if (this.subject.getPreviousState()==0 && this.subject.getCurrentState()==2)
        {
            System.out.println("Service is now being provided by DEF company.");
        }
        else if (this.subject.getPreviousState()==1 && this.subject.getCurrentState()==2)
        {
            if (state)
            {
                System.out.println("All of your services has been shifted to the server of DEF company.");
            }

        }
        System.out.println();

    }
}
