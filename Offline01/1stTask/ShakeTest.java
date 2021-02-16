import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class ShakeTest {

    public static void main(String[]args)
    {
       /*ShakeMaker coffeeShake= new Coffee_Shake("Coffee Shake","Milk","Candy");
       ShakeShack shakeShack=new ShakeShack(coffeeShake);
       shakeShack.produceShake();
       Shake shake1=shakeShack.getShake();
       shake1.printDetails();*/

       boolean orderLoop=true;
       String order,milk1="Milk",topping1="Null";
       String nameOfShake;
       int milk;
       int topping;
       while (orderLoop)
       {
           List<Shake> shakeList= new ArrayList<>();

           System.out.println("Press 'O' to open an order.");
           System.out.println("Press 'E' to exit the order.");

           Scanner input=new Scanner(System.in);
           order = input.nextLine();


           if (order.equalsIgnoreCase("O"))
           {
               boolean shakeLoop=true;
               while (shakeLoop)
               {
                   System.out.println("1.Chocolate Shake");
                   System.out.println("2.Coffee Shake");
                   System.out.println("3.Strawberry Shake");
                   System.out.println("4.Vanilla Shake");
                   System.out.println("5.Zero Shake");
                   System.out.println("6.Bill");

                   nameOfShake=(input.nextLine());

                   if (!nameOfShake.equals("6") && !nameOfShake.equalsIgnoreCase("O") && !nameOfShake.equalsIgnoreCase("E"))
                   {
                       System.out.println("Milk:");
                       System.out.println("1.Regular Milk");
                       System.out.println("2.Lactose-Free Milk");
                       milk=Integer.parseInt(input.nextLine());
                       if (milk==1)
                           milk1="Milk";
                       else if (milk==2)
                           milk1="Lactose-Free Milk";



                       System.out.println("Topping:");
                       System.out.println("1.Candy");
                       System.out.println("2.Cookie");
                       System.out.println("3.Null");

                       topping=Integer.parseInt(input.nextLine());

                       if (topping==1)
                           topping1="Candy";
                       else if (topping==2)
                           topping1="Cookie";
                       else if (topping==3)
                           topping1="Null";




                   }





                   switch (nameOfShake){
                       case "1":
                       {
                           ShakeMaker chocolateShake= new Chocolate_Shake("Chocolate Shake",milk1,topping1);
                           ShakeShack shakeShack=new ShakeShack(chocolateShake);
                           shakeShack.produceShake();
                           Shake shake1=shakeShack.getShake();
                           shakeList.add(shake1);
                           break;



                       }

                       case "2":
                       {
                           ShakeMaker coffeeShake= new Chocolate_Shake("Coffee Shake",milk1,topping1);
                           ShakeShack shakeShack=new ShakeShack(coffeeShake);
                           shakeShack.produceShake();
                           Shake shake2=shakeShack.getShake();
                           shakeList.add(shake2);
                           break;



                       }

                       case "3":
                       {
                           ShakeMaker strawberryShake= new Chocolate_Shake("Strawberry Shake",milk1,topping1);
                           ShakeShack shakeShack=new ShakeShack(strawberryShake);
                           shakeShack.produceShake();
                           Shake shake3=shakeShack.getShake();
                           shakeList.add(shake3);
                           break;



                       }
                       case "4":
                       {
                           ShakeMaker vanillaShake= new Chocolate_Shake("Vanilla Shake",milk1,topping1);
                           ShakeShack shakeShack=new ShakeShack(vanillaShake);
                           shakeShack.produceShake();
                           Shake shake4=shakeShack.getShake();
                           shakeList.add(shake4);
                           break;



                       }

                       case "5":
                       {
                           ShakeMaker zeroShake= new Chocolate_Shake("Zero Shake",milk1,topping1);
                           ShakeShack shakeShack=new ShakeShack(zeroShake);
                           shakeShack.produceShake();
                           Shake shake5=shakeShack.getShake();
                           shakeList.add(shake5);
                           break;



                       }
                       case "6":
                       {
                           int i=0;
                           int Bill=0;
                           for (i=0;i<shakeList.size();i++)
                           {
                               shakeList.get(i).printDetails();
                               Bill=Bill+shakeList.get(i).totalPrice();
                               System.out.println();
                           }
                           if (Bill==0)
                           {
                               System.out.println("You need to order something first.");
                               break;
                           }

                           else
                           {
                               System.out.println("Total Bill Of The Order: "+Bill);
                              // shakeLoop=false;
                              // break;
                               System.out.println("Want to place a new order?");
                               System.out.println("1.Yes");
                               System.out.println("2.No");

                               String newOrder=input.nextLine();

                               if (newOrder.equalsIgnoreCase("1"))
                               {
                                   // System.out.println("Total Bill Of The Order: "+Bill);
                                   shakeLoop=false;
                                   break;
                               }
                               else if (newOrder.equalsIgnoreCase("2"))
                               {
                                   // System.out.println("Total Bill Of The Order: "+Bill);
                                   shakeLoop=false;
                                   orderLoop=false;
                                   break;
                               }

                           }
                       }
                       case "O":
                       {
                           System.out.println("One order is ongoing.");
                           System.out.println("Want to add more items in the current order?");
                           System.out.println();
                           break;

                       }
                       case "o":
                       {
                           System.out.println("One order is ongoing.");
                           System.out.println("Want to add more items in the current order?");
                           System.out.println();
                           break;

                       }
                       case "e" :
                       {
                           if (shakeList.size()!=0)
                           {
                               System.out.println("Successfully exited the order.");
                               System.out.println("Want to place a new order?");
                               System.out.println("1.Yes");
                               System.out.println("2.No");

                               String newOrder=input.nextLine();

                               if (newOrder.equalsIgnoreCase("1"))
                               {
                                  // System.out.println("Total Bill Of The Order: "+Bill);
                                   shakeLoop=false;
                                   break;
                               }
                               else if (newOrder.equalsIgnoreCase("2"))
                               {
                                   // System.out.println("Total Bill Of The Order: "+Bill);
                                   shakeLoop=false;
                                   orderLoop=false;
                                   break;
                               }
                           }

                           else
                           {
                               System.out.println("You need to order something first.");
                               break;
                           }
                       }

                       case "E" :
                       {
                           if (shakeList.size()!=0)
                           {
                               System.out.println("Successfully exited the order.");
                               System.out.println("Want to place a new order?");
                               System.out.println("1.Yes");
                               System.out.println("2.No");
                               String newOrder=input.nextLine();

                               if (newOrder.equalsIgnoreCase("1"))
                               {
                                   // System.out.println("Total Bill Of The Order: "+Bill);
                                   shakeLoop=false;
                                   break;
                               }
                               else if (newOrder.equalsIgnoreCase("2"))
                               {
                                   // System.out.println("Total Bill Of The Order: "+Bill);
                                   shakeLoop=false;
                                   orderLoop=false;
                                   break;
                               }
                           }

                           else
                           {
                               System.out.println("You need to order something first.");
                               break;
                           }
                       }




                   }
               }




           }

           else if (order.equalsIgnoreCase("E"))
           {
               System.out.println("No order ongoing to exit. Place an order first.");
           }



       }

    }
}
