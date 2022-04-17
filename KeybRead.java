import java.lang.*;
import java.util.*;

class KeybRead
{
     public static void main(String arg[])
     {
             Scanner s = new Scanner(System.in);
             String name;
             System.out.println("What is your name?");
             name = s.nextLine();
             
            System.out.println("What is the year?");
            int x = s.nextInt();

            System.out.println("Hello Mr "+ name);
            System.out.println("Akash year  is "+ x);
       }
}