import java.util.Scanner;
public class RegularUser extends Observer {
    Scanner input = new Scanner(System.in);
    private boolean paying = false;
    private int choice;
    public RegularUser(ABC subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Current state of our server has been changed to " + this.subject.getCurrentStateName() + " from the state " + this.subject.getPreviousStateName() + ".");
        if (this.subject.getPreviousState()== 3 && this.subject.getCurrentState()== 1)
        {
            System.out.println("1.  Continue using the limited functionality?");
            System.out.println("2.  Pay 20$ per hour to enjoy the full functionality taking service from server of DEF?(This will copy all your data to the server of DEF.)");
            choice=input.nextInt();
            if (choice==1)
                paying = false;
            else if (choice==2)
            {
                paying = true;
                System.out.println("All your data are copied to the server of DEF.");
            }
        }
        else if (this.subject.getPreviousState()==3 && this.subject.getCurrentState()==2)
        {
            System.out.println("Do you want to pay 20% per hour to take service from DEF company?(This will copy all your data to the server of DEF.)");
            System.out.println("1.  Yes");
            System.out.println("2.  No");
            choice = input.nextInt();
            if (choice==2)
                paying = false;
            else if (choice==1)
            {
                paying = true;
                System.out.println("All your data are copied to the server of DEF.");
            }
        }
        else if (this.subject.getPreviousState()==1 && this.subject.getCurrentState()==3)
        {
            if (paying)
            {
                System.out.println("Your total bill since the last change in our server is 100 BDT");
            }
        }
        else if (this.subject.getPreviousState()==2 && this.subject.getCurrentState()==3)
        {
            if (paying)
            {
                System.out.println("Your total bill since the last change in our server is 100 BDT");
            }

        }
        System.out.println();

    }
}
