import java.util.*;
public class ATM {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       double balance = 5000;
       int choice;
       char ch;
        
       while(true)
       {
        try
            {
                System.out.println("\n*********ATM***********");
                System.out.println("\n1.balance");
                System.out.println("\n2.deposite");
                System.out.println("\n3.withdrawal");
                System.out.println("\n4.exite");
                System.out.println("enter ur choice");
                choice  = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("balace is"+balance);
                        break;
                    case 2:
                        System.out.println("ennter ur amt");
                        int deposite = sc.nextInt();
                        if(deposite <=0)
                            throw new IllegalArgumentException("inavlid amt!");
                        System.out.println(balance = balance+deposite);
                        System.out.println("amt deposited successfully");
                        break;
                    case 3:
                        System.out.println("enter ur amt");
                        int withdraw = sc.nextInt();
                        if(withdraw <= 0)
                            throw new IllegalArgumentException("unsufficient amt");
                        if(withdraw>balance)
                            throw new ArithmeticException();
                        System.out.println(balance = balance-withdraw);
                        System.out.println("withdreaw succeesfully");
                        break;
                    case 4:
                        System.out.println("thanku");
                        break;
                    default:
                        System.out.println("inavalid choice");
                }
            }catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                System.out.println("transaction completed");
            }
            System.out.println("do u wanna coountinue?");
            
        }
    }
}