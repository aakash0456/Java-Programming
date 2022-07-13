import java.lang.*;
import java.util.*;

class area
{
     public static void main(String arg[])
     {
        float base, height, area;
        
        
        System.out.println("Enter the base of triangle");
          Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        System.out.println("Enter the height of triangle");
        
        height = sc.nextFloat();
        area = (1f/2f)*(base*height);
        System.out.println("area of triangle : " + area);
           
         
               
       }
}