public class Test {
    public static void main(String[] args)
    {
        ABC subject1 = new ABC();
        PremiumUser premiumUser = new PremiumUser(subject1);
        RegularUser regularUser = new RegularUser(subject1);

        subject1.setState(1);

    }
}
