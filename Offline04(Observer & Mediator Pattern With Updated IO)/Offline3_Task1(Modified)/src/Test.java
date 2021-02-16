import java.util.Scanner;
public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean inTheLoop = true;
        ABC subject1 = new ABC();
        PremiumUser premiumUser = new PremiumUser(subject1);
        RegularUser regularUser = new RegularUser(subject1);

        int state;

        while (inTheLoop)
        {
            state = input.nextInt();
            if (state == 3)//Press 3 to exit
            break;

            subject1.setState(state);
        }


    }
}
