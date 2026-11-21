 import java.util.*;
public class calculator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char choice;
        while(true){
            System.out.print("enter the 1st num:");
            int num1 = sc.nextInt();
            System.out.print("enter the 2nd num:");
            int num2 = sc.nextInt();
            System.out.println("\n 1.add");
            System.out.println(" 2.sub");
            System.out.println(" 3.multi");
            System.out.println(" 4.divi");
            System.out.print("enter ur choice");
            int ch = sc.nextInt();
            if(ch == 1)
            {
                System.out.println(" result ="+(num1 + num2));
            }
            else if (ch == 2)
            {
                System.out.println(" result ="+(num1 + num2));
            }
            else if( ch == 3)
            {
                System.out.println( " result ="+(num1 - num2));
            }
            else if ( ch == 3)
            {
                System.out.println(" result ="+(num1 * num2));
            }
            else if ( ch == 4)
            {
                if( num2!=0)
                {    
                System.out.println(" result ="+(num1/num2));
                }    
              else
                {
                System.out.println(" division cant be done");
                }
            }
                

    }   

        
    }

}