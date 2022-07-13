import java.lang.*;
import java.util.*;

class CuboidVol
{
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
      int l,b,h, vol;
      System.out.println("Enter the length :");
      l = s.nextInt();
      System.out.println("Enter the breadth :");
      b = s.nextInt();
      System.out.println("Enter the height :");
      h = s.nextInt();
      vol=l*b*h;
      System.out.println("vol is " + vol);
   }
}
  