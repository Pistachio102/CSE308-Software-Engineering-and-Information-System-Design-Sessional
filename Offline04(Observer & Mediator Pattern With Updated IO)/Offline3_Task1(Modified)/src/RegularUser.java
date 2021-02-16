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
        System.out.println("Regular user prompt: Server is " + this.subject.getCurrentStateName() + " now." );

        if (this.subject.getPreviousState()== 0 && this.subject.getCurrentState()== 1)
        {
            System.out.println("Do you want to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF company? In the 2nd case, all your data will be copied to the server of DEF company.\n" +
                    "Please choose:");
            System.out.println("1.  limited functionality");
            System.out.println("2.  pay for full functionality");
            choice=input.nextInt();
            if (choice==1)
                paying = false;
            else if (choice==2)
            {
                paying = true;
                //System.out.println("All your data are copied to the server of DEF.");
            }
        }
        else if (this.subject.getPreviousState()==0 && this.subject.getCurrentState()==2)
        {
            System.out.println("Do you want to pay $20 per hour to take service from the server of DEF company? Note that, it will copy all your data to the server of DEF company.\n" +
                    "Please choose:");
            System.out.println("1.  Yes,pay 20$ per hour");
            System.out.println("2.  No");
            choice = input.nextInt();
            if (choice==2)
                paying = false;
            else if (choice==1)
            {
                paying = true;
                //System.out.println("All your data are copied to the server of DEF.");
            }
        }
        else if (this.subject.getPreviousState()==1 && this.subject.getCurrentState()==0)
        {
            if (paying)
            {
                System.out.println("Your total bill : 100 BDT");
                paying = false;
            }
        }
        else if (this.subject.getPreviousState()==2 && this.subject.getCurrentState()==0)
        {
            if (paying)
            {
                System.out.println("Your total bill : 100 BDT");
                paying = false;
            }

        }
        System.out.println();

    }
}
